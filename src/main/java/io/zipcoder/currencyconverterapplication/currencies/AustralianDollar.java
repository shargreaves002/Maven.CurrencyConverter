package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertibleCurrency {
    //Double aud = CurrencyType.AUSTRALIAN_DOLLAR.getRate();
    @Override
    public Double convert (CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.AUSTRALIAN_DOLLAR.getRate();
    }
}
