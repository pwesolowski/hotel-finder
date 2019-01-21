package com.hrs.sourcing.coding_task.review;

import com.hrs.sourcing.coding_task.review.coordinate.GeoCoordinate;
import com.hrs.sourcing.coding_task.review.currency.Currency;
import com.hrs.sourcing.coding_task.review.price.Price;

public interface TaxiFareFinder {

    String BEAN_NAME = "taxiFareFinder";

    Price getTaxiPrice(GeoCoordinate origin, GeoCoordinate destination, Currency targetCurrency);
}
