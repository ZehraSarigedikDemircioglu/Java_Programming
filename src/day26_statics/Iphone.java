package day26_statics;

public class Iphone {

    public static String brand = "Apple";
    public String model, color;
    public double price;
    public static String OS = "IOS";
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    /*

    public static void printPhoneInfo(){ // static only accepts statics
        System.out.println("Model ": model);
    } // static only accept static

     */
    public void printPhoneInfo(){ // instance methods accepts both static and none static
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
/*
Attributes:
    brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */
