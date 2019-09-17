package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.FRANC;
    }
}
