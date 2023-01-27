package day21_multiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayPractice3 {

    public static void main(String[] args) {

        int[][][] arr3D1 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D2 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };
        int[][][] arr3D3 = { {{1,2}, {3, 4, 5}} ,  {{6, 7, 8, 9},{12, 13, 14}} };

        int[][][][] arr4D = {   arr3D1, arr3D2, arr3D3};

        for (int[][][] eachArr3D : arr4D) {
            System.out.println(Arrays.deepToString(eachArr3D));

            for (int[][] eachArr2D : eachArr3D) {

                System.out.println(Arrays.deepToString(eachArr2D));

                for (int[] eachArr1D : eachArr2D) {

                    System.out.println(Arrays.toString(eachArr1D));

                    for (int eachElement : eachArr1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }


    }
}
