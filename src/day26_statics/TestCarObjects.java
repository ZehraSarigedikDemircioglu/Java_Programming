package day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {

            Car car1 = new Car("X make");
            System.out.println(car1);

            Car car2 = new Car("Q make", "Y model");
            System.out.println(car2);

            Car car3 = new Car("P make", "Z model", 2019);
            System.out.println(car3);

            Car car4 = new Car("A make", "B model", 2022, 50000);
            System.out.println(car4);

            Car car5 = new Car("V make", "Y model", 2020, 30000, "white");
            System.out.println(car5);



    }
}
