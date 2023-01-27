package day11_stringContinue;

import java.sql.SQLOutput;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "Java Programming";

        str1.toLowerCase(); // java programming

        System.out.println(str1); // Java Programming cunku string degismez.

        str1 = str1.toLowerCase(); // simdi assign ettim artik yei bir string oldu
        System.out.println(str1); // java programming

        System.out.println("---------------------------------------------------");

        String str2 = "cydeo";

        str2.toUpperCase();
        System.out.println(str2); // cydeo

        str2 = str2.toUpperCase();
        System.out.println(str2); // CYDEO

        System.out.println("---------------------------------------------------");

        String  word = "Wooden Spoon";
        word = word.toLowerCase();
        System.out.println(word); // wooden spoon
        word = word.toUpperCase();
        System.out.println(word); //WOODEN SPOON


        System.out.println("---------------------------------------------------");

        String str4 = "              Cydeo School     "; // white space
        System.out.println(str4);

        str4 = str4.trim();
        System.out.println(str4);

        System.out.println("---------------------------------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('w');
        System.out.println(index1);

        String s1 = "I love Java Programming";
        int firstA = s1.indexOf('a'); // first character from left to right
        System.out.println(firstA);

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a ");
        System.out.println(a2);

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);

        int a4 = s2.indexOf("aScript");
        System.out.println(a4);

        System.out.println("-------------------------------------------------");

        String w = "Java";
        System.out.println(w.indexOf('a')); // 1
        System.out.println(w.lastIndexOf('a')); // 3

        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('P'));

    }
}
