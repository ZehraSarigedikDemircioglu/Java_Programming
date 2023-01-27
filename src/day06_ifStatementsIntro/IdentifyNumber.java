package day06_ifStatementsIntro;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 100;
        boolean isPositive = number > 0,
                isNegative = number < 0;
        boolean isZero = !isPositive && !isNegative ; // number == 0;

        System.out.println(number + " is positive number: " + isPositive );
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);






    }
}
/*
Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */