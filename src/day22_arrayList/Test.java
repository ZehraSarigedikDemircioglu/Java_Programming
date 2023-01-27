package day22_arrayList;

import utilities.ArraysUtility;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,90};

        boolean has75 = ArraysUtility.contains(numbers, 75);
        System.out.println(has75);


        char[] ch = {'1','0','2','7','3','9','4'};
        boolean hasChar = ArraysUtility.contains(ch, '5');
        System.out.println(hasChar);

        String[] students = {"Sumeye", "Hamza", "Marika"};
        boolean hasKashyar = ArraysUtility.contains(students, "Kashyar");
        System.out.println(hasKashyar);


    }
}
