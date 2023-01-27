package day11_stringContinue;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

       String word = new Scanner(System.in).nextLine();

       if(word.length()>=1){ // if the string has at least one character
           char f = word.charAt(0); // the first character of string
           if(f >= 48 && f <= 57){
               System.out.println("First character is digit");
           }else if(f >= 65 && f <= 90){
               System.out.println("First character is uppercase");
           }else if(f >= 97 && f <= 122){
               System.out.println("First character is lowercase");
           }else{
               System.out.println("First character is special character");
           }


       }else{
           System.out.println("String is empty");
       }
    }
}
