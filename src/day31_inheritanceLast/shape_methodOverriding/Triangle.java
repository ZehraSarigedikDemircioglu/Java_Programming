package day31_inheritanceLast.shape_methodOverriding;

public final class Triangle extends Shape{

    private double side1, side2, base, height;

    public Triangle(double side1, double side2, double base, double height) {
        setSide1(side1);
        setSide2(side2);
        setBase(base);
        setHeight(height);
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

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return base*height/2;
    }

    public double perimeter(){
        return base+side1+side2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t    *     ");
        System.out.println("\t  *   *   ");
        System.out.println("\t* * * * * ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + getName() + '\'' +
                ", side1='" + side1 + '\'' +
                ", side2='" + side2 + '\'' +
                ", base='" + base + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
