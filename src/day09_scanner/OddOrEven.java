package day09_scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");


        int num = input.nextInt();
        String result = "";



        if(num==0){
            result = ("Zero");
        }else if(num%2==0){
            result = ("Even");
        }else{
            result = ("Odd");
        }
        System.out.println(result);

        input.close();


    }
}
