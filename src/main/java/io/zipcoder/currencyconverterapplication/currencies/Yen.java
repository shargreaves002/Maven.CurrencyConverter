package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.YEN;
    }
}
