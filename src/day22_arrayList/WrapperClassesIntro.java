package day22_arrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a1 = 10; // primitive

        Integer a2 = 10; //non-primitive in the Wrapper class

        System.out.println("-----------------------------------------------------");

        int b1 = 100;
        Integer b2 = b1;// auto boxing

        System.out.println(b2);

        double d1 = 0.5;
        Double d2 = d1;

        char ch = 'A';
        Character ch2 = ch;

        System.out.println("-----------------------------------------------");

        Integer n1 = 20; // unboxing
     //   int n2 = n1;
     //   long n3 = n1;  sadece kendi datatype cevir

        Character e1 = 'Z';
        char e2 = e1; // unboxing

        // int e3 = e1;
        // long e4 = e1;






    }
}
