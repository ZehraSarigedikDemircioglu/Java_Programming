package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        //list.add(5.5);

        System.out.println(list); // [10, 20, 30, 10]

        list.add(1, 15);

        System.out.println(list); // [10, 15, 20, 30, 10]

        list.add(2, 25);

        System.out.println(list); // [10, 15, 25, 20, 30, 10]

        System.out.println("--------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Mathias");
        studentsList.add("Tatiana");
        studentsList.add("Aaron");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String first = studentsList.get(0);
        System.out.println(first);

        String last = studentsList.get(studentsList.size()-1);
        System.out.println(last);
    }
}
