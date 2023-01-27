package day13_customMethodsContinue;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C'|| grade == 'D' || grade== 'F';

        if(!isValid){
            System.err.println("Invalid grade");
            return; // Terminates the main method
        }

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
