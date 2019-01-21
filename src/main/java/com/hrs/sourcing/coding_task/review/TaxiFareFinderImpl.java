package com.hrs.sourcing.coding_task.review;

import java.io.IOException;
import java.math.BigDecimal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.hrs.sourcing.coding_task.review.coordinate.GeoCoordinate;
import com.hrs.sourcing.coding_task.review.currency.Currency;
import com.hrs.sourcing.coding_task.review.currency.CurrencyRate;
import com.hrs.sourcing.coding_task.review.currency.CurrencyRateResourceClient;
import com.hrs.sourcing.coding_task.review.currency.SoruceSystemCurrency;
import com.hrs.sourcing.coding_task.review.price.Price;
import com.hrs.sourcing.coding_task.review.price.TaxFareProvider;
import com.hrs.sourcing.coding_task.review.price.TaxiFare;

@Slf4j
@Component(TaxiFareFinder.BEAN_NAME)
public class TaxiFareFinderImpl implements TaxiFareFinder {

    @Autowired
    private TaxFareProvider taxiFareProvider;

    @Autowired
    private CurrencyRateResourceClient currencyRateResourceClient;

    @Cacheable("taxiPrice")
    public Price getTaxiPrice(GeoCoordinate origin, GeoCoordinate destination, Currency targetCurrency) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            TaxiFare taxiFare = taxiFareProvider.getTaxiFare(origin, destination);
            if (!taxiFare.statusNotOK()) {
                BigDecimal taxiFareAmount = BigDecimal.valueOf(taxiFare.getTotal_fare());
                Currency taxiFareCurrency = Currency.valueOf(taxiFare.getCurrency().getInt_symbol().trim());
                Price taxiFareFinderPrice = new Price(taxiFareAmount, taxiFareCurrency);
                if (targetCurrency == null || targetCurrency == taxiFareCurrency) {
                    return taxiFareFinderPrice;
                } else {
                    if (canConvert(taxiFareCurrency, targetCurrency)) {
                        return convert(taxiFareFinderPrice, targetCurrency);
                    } else {
                        return taxiFareFinderPrice;
                    }
                }
            } else {
                log.error("Unable to get taxi fare rate, API returned status : {}", taxiFare.getStatus());
                return null;
            }
        } catch (IOException e) {
        } finally {
            stopWatch.stop();
            log.debug("TaxiFareFinderImpl.getTaxiPrice(): {}", stopWatch.getTotalTimeMillis());
        }
        return null;
    }

    private boolean canConvert(Currency sourceCurrency, Currency targetCurrency) throws IOException {
        return getCurrencyRate(sourceCurrency, targetCurrency) != null;
    }

    private CurrencyRate getCurrencyRate(Currency sourceCurrency, Currency targetCurrency) throws IOException {
        if (sourceCurrency == null || targetCurrency == null) {
            return null;
        }

        SoruceSystemCurrency source = SoruceSystemCurrency.valueOf(sourceCurrency.name());
        SoruceSystemCurrency target = SoruceSystemCurrency.valueOf(targetCurrency.name());


        return currencyRateResourceClient.getCurrencyRates()
                .getCurrencyRates()
                .stream()
                .filter(currencyRate -> currencyRate.getSourceCurrency().equals(source))
                .filter(currencyRate -> currencyRate.getTargetCurrency().equals(target))
                .findFirst()
                .map(currencyRate -> new CurrencyRate(sourceCurrency, targetCurrency, currencyRate.getExchangeRateAsk(), currencyRate.getExchangeRateBid()))
                .orElse(null);
    }

    public Price convert(Price price, Currency targetCurrency) throws IOException {
        try {
            return new Price(convertAndThrow(price.getAmount(), Currency.valueOf(price.getCurrency().getName()), targetCurrency), targetCurrency);
        } catch (RuntimeException e) {
            log.warn("Cannot exchange", e);
            return price;
        }
    }

    BigDecimal convertAndThrow(BigDecimal price, Currency source, Currency target) throws IOException {
        if (price == null) {
            return null;
        }
        if (source == null || target == null) {
            return price;
        }
        if (!canConvert(source, target)) {
            throw new RuntimeException();
        }
        CurrencyRate currencyRate = getCurrencyRate(source, target);
        return price.multiply(currencyRate.getExchangeRateEffective());
    }
}
