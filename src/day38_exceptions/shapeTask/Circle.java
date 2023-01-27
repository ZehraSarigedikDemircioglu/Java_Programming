package day38_exceptions.shapeTask;

public class Circle {

    private double radius;

    public Circle(double radius) {
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if(radius <= 0){
            throw new InvalidShapeException("Radius of the circle can not be zero or negative " + radius);
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
