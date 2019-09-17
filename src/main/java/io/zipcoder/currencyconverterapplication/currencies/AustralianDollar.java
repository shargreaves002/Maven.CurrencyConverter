package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
