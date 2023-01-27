package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[] arr1 = new int[100];

        for (int i = 0, j = 1 ; i < arr1.length; i++, j++) {
            arr1[i] = j;  // 1, 2, 3, ...., 99, 100
        }

        for (int i = 0, j = 10 ; i < arr1.length; i++, j+=10) {
            arr1[i] = j;  // 10, 20, 30, ...., 990, 1000
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }

        System.out.println("array = " + Arrays.toString(arr1));

        System.out.println("--------------------------------------------------------------");

        int[] arr2 = new int[100];

        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = i+1;
        }
/*
        for (int i = 0 , j = 100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }

 */

        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] = 100 - i;
        }



        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
