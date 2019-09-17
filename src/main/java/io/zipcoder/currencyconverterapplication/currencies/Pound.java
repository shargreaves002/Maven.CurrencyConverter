package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertibleCurrency {
    @Override
    public Double convert (CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.POUND.getRate();
    }
}
