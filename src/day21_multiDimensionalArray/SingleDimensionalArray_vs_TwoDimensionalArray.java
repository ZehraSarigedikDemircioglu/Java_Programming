package day21_multiDimensionalArray;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {

    public static void main(String[] args) {

        int[] arr1D = new int[10];

        System.out.println(Arrays.toString(arr1D)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        arr1D[0] = 100;
        System.out.println(Arrays.toString(arr1D)); // [100, 0, 0, 0, 0, 0, 0, 0, 0, 0]
                                                    // bu element 0 oluyor eger tanimli degilse

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 12, 13, 14, 15};
        int[] arr5 = {16, 17, 18, 19, 20, 21};

        int[] arr6 = {30, 40, 50, 60, 70, 80, 90};


        int[][] arr2D = new int[5][];  // index: 0 ~ 4
        System.out.println(Arrays.deepToString(arr2D)); // [null, null, null, null, null]
        // bu 1Darray oldugu icin eger tanimli degilse object oluyor o yuzden null

        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        // arr2D[5] = arr6; // BoundException cunku length 5 yani index 4 max

        System.out.println(Arrays.deepToString(arr2D));
    }
}
