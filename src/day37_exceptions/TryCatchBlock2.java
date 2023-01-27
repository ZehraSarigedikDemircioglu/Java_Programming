package day37_exceptions;

import java.io.FileInputStream;

import static java.lang.Thread.*;

public class TryCatchBlock2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program1 Started");

        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); // display full details of the exception after the execution of program
        }

        System.out.println("Program1 Ended");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Program2 Started");

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
           e.printStackTrace();
           // System.out.println(e.getMessage());
        }

        System.out.println("Program2 Ended");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Program3 Started");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program3 Ended");









    }
}
