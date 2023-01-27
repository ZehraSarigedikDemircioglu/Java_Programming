package day38_exceptions.shapeTask;

public class TestShapeObject {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.setRadius(0);
        System.out.println(circle);

        Square square = new Square(4);
        System.out.println(square);
        square.setSide(0);
    }
}
