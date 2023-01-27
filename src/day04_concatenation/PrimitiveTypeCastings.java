package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        //  implicit is to make smaller to larger

        byte a  = 30;
        int b = a;
        short c = a;
        long d = 3000L;
        float f= d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);

        // explicit is to make larger to smaller, can not be direct

        int x = 100;
        byte y = (byte)x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        float z = 20.8F;
        short k = (short)z; // z = 20.8
        System.out.println("z = " + z);

        System.out.println("k = " + k);

        double n1 = 2.5;
        byte n2 = (byte) n1; // n1 = 2.5
        System.out.println("n2 = " + n2);
        System.out.println("n2 = " + n2);

        int r = 50000;
        short t = (short)r;
        System.out.println("t = " + t);

        double j = 4000.5;
        int v = (int)j;

        System.out.println("j = " + j);
        System.out.println("v = " + v);

        int o = 100;
        double d1 = o;

        System.out.println("o = " + o);
        System.out.println("d1 = " + d1);


    }
}
