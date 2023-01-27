package day10_scannerContinueAndStringIntro;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = input.next();

        input.nextLine();
        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zipcode");
        int zipCode = input.nextInt();

        System.out.println("Your shipping address is:\n\t" + fullName + "\n\t" + buildingNumber
        + " " +streetName + "\n\t" + cityName + " " + state + " " + zipCode);

        input.close();



    }
}
