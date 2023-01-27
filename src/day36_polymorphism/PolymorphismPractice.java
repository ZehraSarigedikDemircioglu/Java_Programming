package day36_polymorphism;

import day30_inheritanceContinue.phoneTask.Iphone;
import day30_inheritanceContinue.phoneTask.Nokia;
import day30_inheritanceContinue.phoneTask.Phone;
import day30_inheritanceContinue.phoneTask.Samsung;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", 900, "Black"),
                new Iphone("Iphone 12 Pro Max", "Large", 1200, "Black"),
                new Iphone("Iphone 9", "Medium", 800, "Gold"),
                new Samsung("Galaxy S19", "Medium", 700, "Pink"),
                new Samsung("Galaxy S20", "Large", 850, "Silver"),
                new Samsung("Galaxy S21", "Large", 950, "Black"),
                new Nokia("XR20", "Small", 350, "Black"),
                new Nokia("G10", "Medium", 99, "White"),
                new Nokia("G50", "Large", 250, "Silver"),
                new Iphone("Iphone 12 Pro", "Large", 1200, "Black"),
                new Iphone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
                new Samsung("Galaxy S18", "Medium", 750, "White"),
                new Samsung("Galaxy S17", "Large", 650, "Silver"),
                new Nokia("G10", "Medium", 99, "Black"),
                new Iphone("IPhone 12", "Large", 1000.5, "Black"),
                new Samsung("Galaxy S22", "Medium", 1100, "White"),
                new Nokia("Brick", "Small", 50, "Pink")
        };

        for (Phone each : phones) {
            System.out.println(each.getModel() + " - " + each.getColor() + " - " + each.getPrice());
        }

        System.out.println("---------------------------------------------------------");

    int countIphone = 0 ;
    int countSamsung = 0 ;

        for (Phone each : phones) {
            if(each instanceof Iphone){
                countIphone++;
            }
            if(each instanceof Samsung){
                countSamsung++;
            }
        }

        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);

        System.out.println("---------------------------------------------------------");

        for (Phone each : phones) {
            if(each instanceof Iphone || each instanceof Samsung){
                if(each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }

    }
}

/*
    1. print the model, color and price of each phone object in the following format
    				model - color - price
	2. How many Iphones in the array of phones?
	3. How many Samsungs in the array of phones?
	4. Display the models of Iphones and samsung that has the price of 700 or greater
 */
