package day12_customMethods;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.next();

        System.out.println("Enter last name");
        String lastName = input.next();

        System.out.println("Enter your domain");
        String domain = input.next();

        String email = firstName + "_" + lastName + domain;


        String first = email.substring(0, email.indexOf("_"));
        String last = email.substring(email.indexOf("_") +1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        email = last + "_" + first + domain;
        System.out.println(email);

        input.close();


    }
}
