package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program1 Started");

        try {
            System.out.println(9/0);
            System.out.println("Try1 Block");
        }catch (ArithmeticException e){
            System.out.println("Catch1 Block");
        }

        System.out.println("Program1 Ended");

        System.out.println("------------------------------------------------------");


        System.out.println("Program2 Started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
        }catch (RuntimeException e){
            System.out.println("Catch2 Block");
        }

        System.out.println("Program2 Ended");

        System.out.println("------------------------------------------------------");

        System.out.println("Program3 Started");
        try {
         Thread.sleep(3000);
            System.out.println("Try3 Block");
        }catch (InterruptedException e){
          System.out.println("Catch3 Block");
}

        System.out.println("Program3 Ended");



    }
}
