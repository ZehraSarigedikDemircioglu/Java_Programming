package day11_stringContinue;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string");
        String first = input.nextLine();

        System.out.println("Enter the second string");
        String second = input.nextLine();

        input.close();

        /*if(first.length()>second.length()){
            System.out.println("first string is the longest");
        }else if(second.length()>first.length()){
            System.out.println("second string is the longest");
        }else{
            System.out.println("equal");
        }
         */

        String result = (first.length()>second.length())?"first string is the longest":
                (second.length()>first.length())?"second string is the longest":"equal";

        System.out.println(result);



    }
}
