package day30_inheritanceContinue.phoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public static boolean hasApplePay=true;

    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is facetiming " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is facetiming " + email);
    }




}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */
