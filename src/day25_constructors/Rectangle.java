package day25_constructors;

public class Rectangle {

    public double width, length;

    /*

    public void setInfo(double width, double length) {
        this.width = width;
        this.length = length;
    }

     */

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                '}';
    }


}
