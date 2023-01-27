package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = input.next(); // if white spaces, input.next().trim();

        System.out.println("Enter last name");
        String lastName = input.next();


        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        // C                                        // ydeo

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        input.close();


       /*
  Write a program that asks user to enter first and last names, and then prints
   the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

        */
    }
}
