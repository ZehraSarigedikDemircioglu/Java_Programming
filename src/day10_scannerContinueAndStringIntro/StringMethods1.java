package day10_scannerContinueAndStringIntro;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "Cydeo";
        // index:     01234

        char firstChar = str.charAt(0); // C
        char secondChar = str.charAt(1); // y
        char thirdChar = str.charAt(2); // d
        char fourthChar = str.charAt(3); // e
        char fifthChar = str.charAt(4); // o
       //  char sixthChar = str.charAt(5); // no 6th character

        // char nthChar = str.charAt(25);//  can not less than zero or more than index number

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);
        // System.out.println("sixthChar = " + sixthChar); // String index range is 5

        System.out.println("-------------------------------------------------------");

        String sentence = "Java Programming Language";

        int length = sentence.length();
        System.out.println(length); // 25
        int lastIndex = length -1;
        System.out.println(lastIndex); // 24

        System.out.println("------------------------------------------------------");

        String s1 = "Wooden Spoon";
        char f = s1.charAt(0);

        int lastIndexNum = s1.length()-1;
        char l = s1.charAt(lastIndexNum);

        System.out.println(f + ":" +l);

        System.out.println("---------------------------------------------------------");

        String s2 = "Java is the best programming language";
        char first = s2.charAt(0);

        int lastInd = s2.length()-1;
        char last = s2.charAt(lastInd);

        System.out.println(first + ":" +last);


        System.out.println("-----------------------------------------------------");

        String name1 = "Umran";  // in the pool
        String name2 = new String("Umran"); // outside of the pool

        System.out.println(name1==name2); //false
        System.out.println(name1.equals(name2)); // true

        System.out.println("-------------------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = "java";
        String r4 = new String("Java");

        System.out.println(r1==r2); // true
        System.out.println(r1==r3); // false
        System.out.println(r2==r3); // false
        System.out.println(r1==r4); // false

        System.out.println(r1.equals(r4)); // true
        System.out.println(r1.equals(r3)); // false
        System.out.println(r1.equalsIgnoreCase(r3)); // true

        System.out.println("----------------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you US citizen?yes/no");
        String answer = input.next();

        if(age>=21 && answer.equals("yes")){
            System.out.println("Eligible to vote");

        }else{
            System.out.println("Not eligible to vote");
        }

        input.close();


















    }
}
