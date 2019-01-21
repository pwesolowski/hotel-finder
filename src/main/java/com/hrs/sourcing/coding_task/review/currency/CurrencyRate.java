package com.hrs.sourcing.coding_task.review.currency;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class CurrencyRate implements Serializable {
    private Currency source;
    private Currency target;
    private BigDecimal exchangeRateAsk;
    private BigDecimal exchangeRateBid;
    private transient volatile BigDecimal value;

    protected CurrencyRate() {
    }

    public CurrencyRate(Currency source, Currency target, BigDecimal exchangeRateAsk, BigDecimal exchangeRateBid) {
        this.source = source;
        this.target = target;
        this.exchangeRateAsk = exchangeRateAsk;
        this.exchangeRateBid = exchangeRateBid;
    }

    public List<CurrencyRate> getCurrencyRates() {
        return new ArrayList<>();
    }
    
    public BigDecimal getExchangeRateEffective() {
        return null;
    }

    public CurrencyRate getSourceCurrency() {
        return null;
    }

    public CurrencyRate getTargetCurrency() {
        return null;
    }

    public BigDecimal getExchangeRateAsk() {
        return exchangeRateAsk;
    }

    public BigDecimal getExchangeRateBid() {
        return exchangeRateBid;
    }
}
