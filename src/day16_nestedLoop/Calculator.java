package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "Yes";

        while (answer.equals("yes")){
            System.out.println("Enter first number");
            double num1 = input.nextInt();

            System.out.println("Enter a math operator");
            char operator = input.next().charAt(0);

            while(!(operator=='+' || operator=='-' || operator=='*' || operator=='/')){
                System.err.println("Invalid operator! Please re-enter your operator");
                operator = input.next().charAt(0);
            }
            System.out.println("Enter second number");
            double num2 = input.nextInt();


            double result = (operator=='+')?num1+num2:(operator=='-')?num1-num2:(operator=='*')?num1*num2:num1/num2;

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Answer! Would you like to continue? Yes/No");
                answer = input.next();
            }
        }


    }
}
