package day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double totalprice = 0;

        switch (size){
            case 's' : case 'S':
                totalprice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'm' : case 'M':
                totalprice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'l' : case 'L':
                totalprice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            default:
                System.out.println("invalid size");
        }
        return totalprice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public static void main(String[] args) {
        Pizza pizza1  = new Pizza();
        pizza1.setInfo('S', 2, 3);

        Pizza pizza2  = new Pizza();
        pizza2.setInfo('L', 0, 5);

        System.out.println(pizza1);
        System.out.println(pizza1.calcCost());
        System.out.println(pizza2);
        System.out.println(pizza2.calcCost());

        System.out.println("-------------------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {
            Pizza small = new Pizza();
            small.setInfo('S', 2, 2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M', 3, 4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4, 5);
            total += large.calcCost();
        }
        System.out.println("total = " + total);
    }
}
/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping
			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */
