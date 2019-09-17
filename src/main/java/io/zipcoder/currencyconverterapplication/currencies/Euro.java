package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertibleCurrency {
    @Override
    public Double convert (CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.EURO.getRate();
    }
}
