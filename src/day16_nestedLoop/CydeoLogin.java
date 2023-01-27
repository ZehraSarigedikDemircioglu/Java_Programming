package day16_nestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String tryName = input.next();
        System.out.println("Please enter your password");
        String tryPassword = input.next();

        String userName = "Cydeo";
        String password = "WoodenSpoon";


        if(userName.equals(tryName) && password.equals(tryPassword)) {
            System.out.println("Logged in");
        }else{
            for (int i = 0; i <=3; i++) {
                if(i != 2) {
                    System.err.println("Incorrect Entry!");
                }else{
                    System.err.println("This is your last attempt");
                }
                System.out.println("Please re-enter your name");
                tryName = input.next();
                System.out.println("Please re-enter your password");
                tryPassword = input.next();

               if(userName.equals(tryName) && password.equals(tryPassword)){
                   System.out.println("You are now logged in");
                   break; // exits the loop
               }

            }
            if(!(userName.equals(tryName) && password.equals(tryPassword))){
                System.out.println("Your account is now locked");
            }
        }
        input.close();



    }
}
