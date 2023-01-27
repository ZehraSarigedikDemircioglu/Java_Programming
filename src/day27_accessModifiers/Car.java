package day27_accessModifiers;

public class Car { // outer class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ // inner class

      //  static int a; static olmaz
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }
    }

    public static class StaticInnerClass{

        public void method(){
            //System.out.println(make); static only accept static
            System.out.println(wheels);
        }

    }
}
