package day13_customMethodsContinue;

import java.sql.SQLOutput;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(isOdd(4));
/*
        int num = 200;
        if(isEven(num)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

 */

        System.out.println(isEven(5));
        System.out.println(isEven(4));

        System.out.println(max(5,8));

        System.out.println(min(7,6));



    }

    public static boolean isOdd(int num){
        return (num%2!=0)? true: false;
/*
        if(num%2!=0){
            return true;
        }
        return false;


 */
    }

    public static boolean isEven(int num){
        return !isOdd(num);
    }

    public static int max(int num1, int num2){

        // return num1>num2? num1: num2;
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static int min(int num1, int num2){
        return num2;
    }
}
/*
Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */