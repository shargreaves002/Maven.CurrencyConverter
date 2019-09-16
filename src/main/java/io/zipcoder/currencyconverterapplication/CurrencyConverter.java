package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    /**
     * @param amountOfBaseCurrency - amount of money to convert
     * @param sourceCurrencyType - type of currency being converted from
     * @param targetCurrencyType - type of currency you want to convert to
     * @return - the amount of money in the target currency type
     */
    public static Double convert(Double amountOfBaseCurrency, ConvertibleCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }
}
