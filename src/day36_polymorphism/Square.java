package day36_polymorphism;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square)){
            System.err.println("Invalid object");
            System.exit(1);
        }
        if(this.side == ((Square) obj).side){
            return true;
        }
        return false;
    }
}
