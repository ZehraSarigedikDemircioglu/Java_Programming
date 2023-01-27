package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin";
        myGroup[myGroup.length-1] = "Asel";
        myGroup[2] = "Sumeye";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khaskayar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat";
       //  myGroup[5] = "Muhtar";  index out of bound

        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------------------------------");

        for (int i = myGroup.length-1; i >= 0 ; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < myGroup.length; i++) { //myGroup.fori
            System.out.println(myGroup[i]);
        }

        System.out.println("------------------------------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {   //myGroup.forr
            System.out.println(myGroup[i]);
        }

    }
}
