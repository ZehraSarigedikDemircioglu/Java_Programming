package day09_scanner;

import java.util.Scanner;

public class IsEligible {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age");

        byte age = input.nextByte();
        String result = ((age >= 0) && (age <= 100)) ?
                (age >= 21) ? "Eligible" : "Not Eligible"
                : "Invalid";

        System.out.println(result);

        input.close();
    }
}
