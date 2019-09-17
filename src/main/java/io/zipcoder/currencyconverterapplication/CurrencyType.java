package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertibleCurrency currency) {
        String x = currency.getClass().getSimpleName();
        switch (x){
            case ("AustralianDollar"):
                return AUSTRALIAN_DOLLAR;
            case ("CanadianDollar"):
                return CANADIAN_DOLLAR;
            case ("ChineseYR"):
                return CHINESE_YR;
            case ("Euro"):
                return EURO;
            case ("Franc"):
                return FRANC;
            case ("Pound"):
                return POUND;
            case ("Ringgit"):
                return RINGGIT;
            case ("Rupee"):
                return RUPEE;
            case ("SingaporeDollar"):
                return SINGAPORE_DOLLAR;
            case ("UniversalCurrency"):
                return UNIVERSAL_CURRENCY;
            case ("USDollar"):
                return US_DOLLAR;
            case ("Yen"):
                return YEN;
            default:
                return null;
        }
    }
}
