package day10_scannerContinueAndStringIntro;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int num = scan.nextInt();
        String result = "";

        if(num>=1 && num <=7){
            switch(num) {
                case 1:
                    result = "Mon";
                    break;
                case 2:
                    result = "Tues";
                    break;
                case 3:
                    result = "Wed";
                    break;
                case 4:
                    result = "Thurs";
                    break;
                case 5:
                    result = "Fri";
                    break;
                case 6:
                    result = "Satur";
                    break;
                default:
                    result = "Sun";
            }
            }else{
                result = "Invalid";
            }
            System.out.println(result);
        scan.close();
    }
}
