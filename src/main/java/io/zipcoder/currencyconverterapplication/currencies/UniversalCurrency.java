package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }
}
