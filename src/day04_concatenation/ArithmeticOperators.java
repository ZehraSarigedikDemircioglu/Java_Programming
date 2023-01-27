package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200); // + is both addition and concatenation

        System.out.println(40 - 10); // - is only numbers, "40" - 10 can not

        System.out.println(20 / 6); // only int value

        System.out.println(20 / 6.0); // exact value

        System.out.println(20.0 / 6); // exact value

        System.out.println(20.0 / 6.0); // exact value

        System.out.println(20d / 6); // d or D can write for double

        System.out.println((int)(20.0 / 6.0)); // to make int

        // System.out.println(9/ 0); can not zero


        System.out.println(10 * 2);

        System.out.println(20 * 12);

        System.out.println(10 % 3);

    }
}

/*
int/ int ==> only int value
int / double ==> double
double / int ==> double
double / double ==> double
 */