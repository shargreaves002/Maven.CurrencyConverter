package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.RUPEE;
    }
}
