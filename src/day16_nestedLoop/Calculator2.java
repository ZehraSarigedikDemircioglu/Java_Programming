package day16_nestedLoop;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("Enter first number");
            double num1 = input.nextDouble();

            System.out.println("Enter a math operator");
            char operator = input.next().charAt(0);

            while(!(operator=='+' || operator=='-' || operator=='*' || operator=='/')){
                System.err.println("Invalid operator! Please re-enter your operator");
                operator = input.next().charAt(0);
            }
            System.out.println("Enter second number");
            double num2 = input.nextDouble();

            double result = (operator=='+')?num1+num2:(operator=='-')?num1-num2:(operator=='*')?num1*num2:num1/num2;
            System.out.println(result);

            System.out.println("Would you like to continue? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Answer! Would you like to continue? Yes/No");
                answer = input.next();
            }
            if(answer.equals("no")){
                break;
            }
        }
    }
}
