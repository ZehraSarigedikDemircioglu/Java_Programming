package day38_exceptions.shapeTask;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if(side <= 0){
            throw new InvalidShapeException("Side of square can not be zero or negative " + side);
        }
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
