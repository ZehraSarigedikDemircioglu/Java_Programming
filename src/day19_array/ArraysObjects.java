package day19_array;

import java.util.Arrays;

public class ArraysObjects {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        // only one objects in the heap
        // 3 variables referance ,arr1, arr2, arr3
        // one object can share with multiple referance variables
        // arr1, arr2, arr3 in the stack

        System.out.println(Arrays.toString(arr1)); // {10, 20, 30, 40, 50}
        System.out.println(Arrays.toString(arr2)); // {10, 20, 30, 40, 50}
        System.out.println(Arrays.toString(arr3)); // {10, 20, 30, 40, 50}


        arr1[0]= 1000;

        System.out.println(Arrays.toString(arr1)); // {1000, 20, 30, 40, 50}
        System.out.println(Arrays.toString(arr2)); // {1000, 20, 30, 40, 50}
        System.out.println(Arrays.toString(arr3)); // {1000, 20, 30, 40, 50}

        arr2[2]= 3000;
        System.out.println(Arrays.toString(arr1)); // {1000, 20, 3000, 40, 50}
        System.out.println(Arrays.toString(arr2)); // {1000, 20, 3000, 40, 50}
        System.out.println(Arrays.toString(arr3)); // {1000, 20, 3000, 40, 50}

        System.out.println("-------------------------------------------------");

        String[] a1 = {"Umran", "Mehmet"};
        a1 = new String[]{"James", "Daniel"};

        System.out.println(Arrays.toString(a1)); // {"James", "Daniel"}

        // one referance variable can only one object, the others garbage collection
    }
}
