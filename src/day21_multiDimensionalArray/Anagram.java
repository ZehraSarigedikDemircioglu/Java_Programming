package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart"; //"aehtr"
        String str2 = "earth"; //"aehtr"

        // String[] a1 = str1.split("");  // [h,e,a,r,t]  this is one way

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        /*

        boolean isAnagram= false;

        if(Arrays.equals(a1,a2)){
            isAnagram = true;
        }

         */
        boolean isAnagram = Arrays.equals(a1,a2);
        System.out.println(isAnagram);
    }
}
