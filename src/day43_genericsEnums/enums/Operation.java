package day43_genericsEnums.enums;

public enum Operation {
    PLUS, MINUS, MULTIPLY, DIVIDE;

    private Operation() { // and this constructor is private as default
        System.out.println("Constructor");  // Each constant is object(new keyword) of operation, so constructor 4 times appear when we run to main code
    }
}
