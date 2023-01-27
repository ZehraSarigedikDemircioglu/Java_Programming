package day36_polymorphism;


public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false
        System.out.println(circle1.equals(circle2)); // true
        System.out.println (circle1.equals(circle3) );  // false


        System.out.println("----------------------------------------------------------");

        Iphone iphone1 = new Iphone("Apple", "Iphone 12", "Medium", "Black", 900);
        Iphone iphone2 = new Iphone("Apple", "Iphone 12", "Medium", "Black", 900);

        System.out.println(iphone1.equals(iphone2));

        System.out.println("----------------------------------------------------------");

        Square square1 = new Square(3);
        Square square2 = new Square(3);

        System.out.println(square1.equals(square2));










    }
}
