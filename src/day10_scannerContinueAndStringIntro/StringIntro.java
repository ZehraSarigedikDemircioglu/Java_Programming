package day10_scannerContinueAndStringIntro;


import java.util.Scanner; // bu otomatik implicit oluyor
import java.lang.String; // bunu elle yazmak gerekiyor
import java.lang.System; // lang package icin vermeye gerek yok ancak diger paketler icin zorunlu yazmak

public class StringIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        // "Java" ==> 'J' 'a' 'v' 'a'
        // "CYdeo123" ==> 'C' 'Y' 'd' 'e' 'o' '1' '2' '3' (1-2-3 de burda char cunku string icinde!)

        System.out.println();
        input.close();

        System.out.println("---------------------------------");

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";  // in the pool only 2
        String s4 = "Cat"; // 4 string literal object

        System.out.println(s1==s3); //true
        System.out.println(s1==s4); //true
        System.out.println(s3==s4); //true

        String str1 = new String("Java"); // Creates two objects: 1. String pool, 2. in heap(outside Pool)
        String str2 = new String("Java");

        System.out.println(str1==str2); // false
        // new string tanimlandin mi o heap te yeni bir string olur ve asla esit olmaz. They are not same object IN THE HEAP!
        // outside of the poll yani
        // ancak bu pool da sadece bir olur.

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1==t2); //false
        System.out.println(t2==t3); //false







    }
}
