package day19_array;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        int score1 = 76;
        int score2 = 65;
        int score3 = 95;
        int score4 = 85;
        int score5 = 78;

        System.out.println("---------------------------------------------------");

        int[] scores = new int[5]; // index: 0 ~ 4
        scores[2] = 95;
        scores[0] = 76;
        scores[1] = 65;
        scores[3] = 85;
        scores[4] = 78;

        // scores[5] = 100; boundsException
        // scores[-1] = 70;

       // scores = new int[10]; // bunu tanimlayinca oncekiler garbage collection gider, butun degerler 0 olur.
        System.out.println(Arrays.toString(scores));  // [76, 65, 95, 85, 78]
        System.out.println(scores[2]); // 95

        System.out.println("-----------------------------------------------------");
/*
        for (int i = 0; i < 5; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }

 */
        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("---------------------------------------------------------------");

        System.out.println(scores[scores.length-1]);

    }
}
