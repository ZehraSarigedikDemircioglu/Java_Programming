package day43_genericsEnums.enums;

public enum Currency {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);  // these are constant objects of this class


    private int value;

    private Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
