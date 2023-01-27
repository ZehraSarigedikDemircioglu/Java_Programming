package day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {

        int[] array = new int[5]; // {0,0,0,0,0}

        array[0] = 10; // {10,0,0,0,0}
        array[1] = 20; // {10,20,0,0,0}
        array[2] = 30; // {10,20,30,0,0}
        array[3] = 40; // {10,20,30,40,0}
        array[4] = 50; // {10,20,30,40,50}
        //array[5] = 50; // outOfBoundException

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------------");

        ArrayList<Integer> name = new ArrayList<>();

        System.out.println(name);
        System.out.println(name.size());
    }
}
