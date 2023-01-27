package day12_customMethods;

public class CustomMethodsMaxNumber {

    public static void main(String[] args) {

maxNumber(3,5);

maxNumber(10.5,20.6);

maxNumber(-20, -100);

maxNumber(2,2);

    }

    public static void maxNumber(double num1, double num2){

        if(num1>num2){
            System.out.println(num1 + " is max number");
        }else if(num2>num1){
            System.out.println(num2 + " is max number");
        }else{
            System.out.println("Equal");
        }

    }
}

// create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal", (num1, num2)

