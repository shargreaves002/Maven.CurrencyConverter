package io.zipcoder.currencyconverterapplication;

public interface ConvertibleCurrency {
    /**
     *
     * @param currencyType - type of currency to convert to
     * @return - return a number representing the multiplication factor
     * needed to mutiply the original currency amount
     * to get to the new currency
     */
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getType().getRate();
    }

    CurrencyType getType();
}