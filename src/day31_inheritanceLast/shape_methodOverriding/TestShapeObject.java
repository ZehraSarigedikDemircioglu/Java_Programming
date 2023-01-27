package day31_inheritanceLast.shape_methodOverriding;

public class TestShapeObject {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);

        square.draw();

        System.out.println("--------------------------------------------------");

        Circle circle = new Circle(3.5);
        System.out.println(circle);

        circle.draw();

        System.out.println("--------------------------------------------------");

        Triangle triangle = new Triangle(2,2,3,1.5);
        System.out.println(triangle);

        triangle.draw();

        System.out.println("--------------------------------------------------");

        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println(rectangle);

        rectangle.draw();
    }
}
