package day11_stringContinue;

import java.sql.SQLOutput;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "";

        boolean r1 = word.isEmpty(); // bosluk olsa da false
        System.out.println(r1); // true


        System.out.println("--------------------------------------------------");

        String str = "                           ";

        boolean r2 = str.isBlank();
        System.out.println(r2); // true

        System.out.println("---------------------------------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3)); // false

        System.out.println(str2.equalsIgnoreCase(str3)); // true

        System.out.println("----------------------------------------------------");

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        System.out.println("------------------------------------------------------");

        String students = "Hasan Naran Sumeye Natalia";

        boolean hasAhmet = students.contains("Ahmet");

        System.out.println(hasAhmet);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.contains("Java"); // false

        System.out.println(sentence.toLowerCase().contains("java")); // true

        System.out.println("-------------------------------------------------------");

        String name = "Michael";

        boolean l = name.startsWith("Da"); // false
        System.out.println(l);

        String  url = "www.cydeo.com";

        boolean isValid = url.startsWith("www."); // true
        System.out.println(isValid);

        boolean isTrue = url.endsWith(".com"); // true
        System.out.println(isTrue);

        System.out.println("--------------------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);


    }
}
