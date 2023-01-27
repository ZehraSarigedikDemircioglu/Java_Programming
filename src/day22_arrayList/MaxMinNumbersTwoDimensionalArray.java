package day22_arrayList;

import java.util.Arrays;

public class MaxMinNumbersTwoDimensionalArray {

    public static void main(String[] args) {

        //index of elements 0   1   2     0     1    2      0    1   2
        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};
        // index of 1D array    0               1                2


        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {
            //System.out.println(Arrays.toString(each1D));
            for (int eachElement : each1D) {
                if(eachElement>max){
                    max=eachElement;
                }
                if(eachElement<min){
                    min=eachElement;
                }
            }
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is: " + min);
    }
}
