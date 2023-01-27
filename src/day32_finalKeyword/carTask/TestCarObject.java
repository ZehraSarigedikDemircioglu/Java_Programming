package day32_finalKeyword.carTask;

public class TestCarObject {

    public static void main(String[] args) {

        Audi audi = new Audi("Q6", "Silver", 2021, 50000);
        BMW bmw = new BMW("X6", "Black", 2017, 45000);
        Honda honda =  new Honda("Accord", "Gray", 2019, 24000);
        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);
        Toyota toyota = new Toyota("Camry", "Blue", 2020, 25000);

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(toyota);

        System.out.println("---------------------------------------------");

        System.out.println(audi.getColor());
        System.out.println(audi.getYear());
        System.out.println(audi.getPrice());

        System.out.println(tesla.getModel());
        System.out.println(tesla.getYear());
        System.out.println(tesla.getPrice());

        System.out.println("---------------------------------------------");

        audi.start();
        bmw.start();
        honda.start();
        tesla.start();
        toyota.start();

        //tesla.setPrice(30000);
       // System.out.println(tesla);



    }
}
