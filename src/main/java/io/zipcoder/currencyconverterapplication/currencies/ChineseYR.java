package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertibleCurrency {
    public CurrencyType getType() {
        return CurrencyType.CHINESE_YR;
    }
}
