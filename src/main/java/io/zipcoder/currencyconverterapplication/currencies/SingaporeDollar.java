package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}
