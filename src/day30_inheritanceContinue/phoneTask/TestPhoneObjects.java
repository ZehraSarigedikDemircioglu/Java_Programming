package day30_inheritanceContinue.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

       Iphone iphone = new Iphone("IPhone 12", "Large", 1000.5, "Black");
       Samsung samsung = new Samsung("Galaxy S22", "Medium", 1100, "White");
       Nokia nokia = new Nokia("Brick", "Small", 50, "Pink");


       iphone.call(123456789);
       iphone.text(123456789);

       samsung.call(123456789);
       samsung.text(123456789);

       nokia.call(123456789);
       nokia.text(123456789);

        System.out.println("-----------------------------------------------");

        iphone.faceTime("z@gmail.com");
        iphone.faceTime(123456789);

        samsung.freeze();

        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



    }
}
