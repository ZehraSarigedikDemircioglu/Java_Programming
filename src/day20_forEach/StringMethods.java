package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("-------------------------------------------------");

        String str2 = "Today is a great day to learn Java";

        //String[] words = str2.split("great");
        // [Today is a ,  day to learn Java]

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));
        // [Today, is, a, great, day, to, learn, Java]

        String sentence = "I love Java";
        sentence.split(" "); // I, love, Java

        String[] arr = ArraysUtility.reverse(sentence.split(" ")); // [Java, love, I]


        System.out.println(Arrays.toString(arr)); // bu array seklinde sonuc

        String reversedSentence = "";

        for (int i = 0; i < arr.length; i++) { // bu cumleye ceviriyor
            reversedSentence += arr[i] + " ";
        }
        System.out.println(reversedSentence);







    }
}
