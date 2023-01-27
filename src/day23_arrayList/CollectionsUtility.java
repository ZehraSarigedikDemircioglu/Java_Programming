package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));
       Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        int min = Collections.min(list);
        System.out.println(min);

        int max = Collections.max(list);
        System.out.println(max);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String>  items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        Collections.sort(items);
        System.out.println(items);

        System.out.println("---------------------------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("---------------------------------------------------------------");

        Collections.swap(items, 1,2);
        System.out.println(items);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println(students); // [Gadir, Hasan, Abidullah, Bilal]

        Collections.swap(students,0,students.size()-1);
        System.out.println(students); // [Bilal, Hasan, Abidullah, Gadir]

    }
}
