package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);
        System.out.println(result);

        System.out.println("---------------------------------------------------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1,a2); // true
        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1, ch2); // false
        System.out.println(r2);

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};

        boolean r3 = Arrays.equals(s1, s2); // false
        System.out.println(r3);

        System.out.println("---------------------------------------------------");

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);

        System.out.println("---------------------------------------");

        String[] b1 = {"C", "A", "B"};
        String[] b2 = {"B", "C", "A"};

        Arrays.sort(b1); //b1 = {A, B, C}
        Arrays.sort(b2); //b2 = {A, B, C}

        System.out.println(Arrays.equals(b1, b2)); // sort ettikten sonra true olur

        System.out.println("---------------------------------------");

        String[] students = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------");

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array2 = Arrays.copyOf(array, 7); // 2. length oluyor.

        System.out.println(Arrays.toString(array2));

        int[] array3= Arrays.copyOf(array, 4); // ne kadar istiyorsan lengthe kadar

        System.out.println(Arrays.toString(array3));

        int[] array4= Arrays.copyOf(array, 10); // lengthden sonrasi 0 olur.

        System.out.println(Arrays.toString(array4));

        System.out.println("---------------------------------------");

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6,7,8,9,10,11,12};

        int[] n3 = Arrays.copyOf(n1, n1.length+n2.length);

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("----------------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //  index:    0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch, 4);
        System.out.println(Arrays.toString(result1)); // A, B, C, D

        char[] result2 = Arrays.copyOf(ch, 20);
        System.out.println(Arrays.toString(result2)); // A, B, C, D, E, F, G,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,

        char[] result3 = Arrays.copyOfRange(ch, 2, 5); // excluded substringdeki gibi o yuzden +1
        System.out.println(Arrays.toString(result3)); // C, D, E

        char[] result4 = Arrays.copyOfRange(ch, 2, ch.length); // excluded substringdeki gibi o yuzden +1
        System.out.println(Arrays.toString(result4)); // C, D, E, F, G











    }
}
