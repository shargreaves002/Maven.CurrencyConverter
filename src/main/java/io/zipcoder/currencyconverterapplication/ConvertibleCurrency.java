package io.zipcoder.currencyconverterapplication;

public interface ConvertibleCurrency {
    /**
     *
     * @param currencyType - type of currency to convert to
     * @return - a double representative of that currency type
     */
    default Double convert(CurrencyType currencyType) {
        /*TODO: return a different double for each currency type.
        Will be multiplied by the amount of currency to be converted,
        so it needs to represent the exchange value between the two currencies
         */

        return Double.MAX_VALUE;
    }
}
