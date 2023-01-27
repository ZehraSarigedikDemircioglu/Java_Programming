package day25_constructors;

public class TestRectangleObjects {

    public static void main(String[] args) {

        /*

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(10.5,20.5);
        System.out.println(rectangle1);
        System.out.println(rectangle1.area());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(2,3);
        System.out.println(rectangle2);
        System.out.println(rectangle2.area());

        Rectangle rectangle3 = new Rectangle();
        System.out.println(rectangle3);
        System.out.println(rectangle3.area());

         */

        Rectangle rectangle1 = new Rectangle(2,3);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(2,3);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(3,4);
        System.out.println(rectangle3);
        System.out.println("3rd rectangle area is: " + rectangle3.area());


    }
}
