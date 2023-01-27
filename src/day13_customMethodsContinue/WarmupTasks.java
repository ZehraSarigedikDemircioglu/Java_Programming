package day13_customMethodsContinue;

import java.util.Scanner;

public class WarmupTasks {

    public static void main(String[] args) {

        ageGroups(-1);
        ageGroups(21);
        ageGroups(55);

        eligibleToVote(21, true);
        eligibleToVote(21, false);

        calculate(10, 20, '+');
        calculate(200, -5, '/');
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator");
        double n1 = input.nextDouble(),
               n2 = input.nextDouble();
        char operator = input.next().charAt(0);
        calculate(n1, n2, operator);

 */

    }

    public static void ageGroups(int age){

        if(age>=0 && age<150){

            System.out.println((age<21)?"Teenager":(age<55)?"Adult":"Senior");
            /*
            if (age<21){
                System.out.println("Teenager");
            }else if(age< 55){
                System.out.println("Adult");
            }else{
                System.out.println("Senior");
            }
                */
        }else{
            System.err.println("Invalid age");
        }

    }
    public static void eligibleToVote(int age, boolean isAmerican){
        if(age>=18 && isAmerican==true){
            System.out.println("you are eligible to vote");
        }else{
            System.err.println("You are not eligible to vote");
        }
    }

    public static void calculate(double num1, double num2, char mathOperator){


        switch (mathOperator){
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1-num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1/num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1*num2));
                break;
            default:
                System.out.println("invalid");
        }

        System.out.println("");
    }
}
