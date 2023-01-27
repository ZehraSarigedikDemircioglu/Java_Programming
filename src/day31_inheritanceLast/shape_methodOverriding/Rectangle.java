package day31_inheritanceLast.shape_methodOverriding;

public final class Rectangle extends Shape{

    private double side1, side2;

    public Rectangle(double side1, double side2) {
        setSide1(side1);
        setSide2(side2);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1*side2;
    }

    @Override
    public double perimeter() {
        return 2*(side1+side2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("* * * * * * * *");
        System.out.println("*             *");
        System.out.println("*             *");
        System.out.println("* * * * * * * *");
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", side1='" + side1 + '\'' +
                ", side2='" + side2 + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
