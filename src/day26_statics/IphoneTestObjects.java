package day26_statics;

public class IphoneTestObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone12", "Black", 1000);

        System.out.println(iphone1.color);
        System.out.println(iphone1.model);
        System.out.println(iphone1.price);

        iphone1.printPhoneInfo();

        System.out.println(iphone1.brand);
        System.out.println(iphone1.OS);
        iphone1.printOperatingSystem();

        System.out.println(Iphone.isExpensiveToFix);
        System.out.println(Iphone.brand);
        Iphone.printOperatingSystem();
    }
}
