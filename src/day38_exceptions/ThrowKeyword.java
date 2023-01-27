package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Please enter your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age < 0 || age > 150){
            if(age < 0) {
                throw new InputMismatchException("Age of person should not be negative " + age);
            }else{
                throw new InputMismatchException("Age of person can not be greater than 150 " + age);
            }
        }

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("-------------------------------------------------------");

        //throw new RuntimeException("Runtime Exception");
        //System.out.println("Hello World"); // after crushed the prog, it cant show up

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------------------------------------");

        RuntimeException exception = new RuntimeException();
        //throw exception; // if use more than once
        //throw new RuntimeException();
        //throw new Person("Jimmy", 45, 'M'); // NO RELATIONSHIP WITH THROWABLE




    }
}
