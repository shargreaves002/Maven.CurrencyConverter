package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertibleCurrency {
    @Override
    public Double convert (CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.RUPEE.getRate();
    }
}
