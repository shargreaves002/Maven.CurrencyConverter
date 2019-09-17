package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.CANADIAN_DOLLAR;
    }
}
