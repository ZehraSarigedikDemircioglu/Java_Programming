package day19_array;

import java.util.Arrays;

public class ArraysLiteral {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {10, 20, 30, 40, 50};  // Arrays Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("------------------------------------------------------");

        //   element         1          2         3            4          5           6          7
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //       index       0          1          2            3          4          5          6

        int n=1;
        System.out.println(days[n-1]);

        System.out.println("------------------------------------------------------");

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

       /*
        String[] month = new String[12];
        month[0] = "Jan";
        .....

        */


        System.out.println("months = " + Arrays.toString(months));

        System.out.println("------------------------------------------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }

    }
}
