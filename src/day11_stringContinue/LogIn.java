package day11_stringContinue;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {


        String correctUserName = "Cydeo";
        String correctPassword = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = input.nextLine();

        System.out.println("Enter your password");
        String password = input.nextLine();


        input.close();


        if(correctUserName.equals(username) && correctPassword.equals(password)){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect username or password. Please try again");
        }
    }
}
