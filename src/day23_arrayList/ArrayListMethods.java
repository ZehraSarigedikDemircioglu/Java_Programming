package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        array[0] = 100;
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

        // groceries.list[2] = "Oranges" // bu Arrayde gecerli!!!!!!!!!

        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");
        System.out.println(groceriesList);

        groceriesList.remove(0);
        System.out.println(groceriesList);
        groceriesList.remove("Chicken");
        System.out.println(groceriesList);


        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers); // [10, 20, 30, 40, 50]

        numbers.remove(1);
        System.out.println(numbers); // [10, 30, 40, 50]

        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers); // [30, 40, 50]

        numbers.clear(); // []
        System.out.println(numbers);

        System.out.println("---------------------------------------------------------");

        ArrayList<String > names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl")); // 0
        System.out.println(names.lastIndexOf("Vasyl")); // 1
        System.out.println(names.lastIndexOf("Sumeye")); // 5

        boolean hasMuhtar = names.contains("Muhtar"); // false
        System.out.println("hasMuhtar: " + hasMuhtar);

        boolean hasAli = names.contains("Ali"); // true
        System.out.println("hasAli: " + hasAli);

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1; // only one object in the heap, shared two referances

        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2); // true

        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>(); // two objects in the heap, two referances

        list3.add(10);
        list4.add(10);
        System.out.println(list3); // [10]
        System.out.println(list4); // [10]
        System.out.println(list3==list4); // false

        System.out.println(list3.equals(list4)); // true

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // false

        System.out.println("-------------------------------------------------");

        System.out.println(n1.isEmpty()); // false
        System.out.println(n2.isEmpty()); // false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); // true
        System.out.println(n2.isEmpty()); // true




    }
}
