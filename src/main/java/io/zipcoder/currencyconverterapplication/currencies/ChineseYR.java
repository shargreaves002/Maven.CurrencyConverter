package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertibleCurrency {
    @Override
    public Double convert (CurrencyType currencyType) {
        return currencyType.getRate() / CurrencyType.CHINESE_YR.getRate();
    }
}
