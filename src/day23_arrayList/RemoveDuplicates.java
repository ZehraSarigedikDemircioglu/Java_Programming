package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String > names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        ArrayList<String> nonDup = new ArrayList<>();
        for (String each : names) {
            if (!nonDup.contains(each)) {
                nonDup.add(each);
            }
        }

        //System.out.println(names); // [Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye]
        // names = nonDup; yaparsak names garbage collection gider
        //System.out.println(names); // [Vasyl, Sumeye, Ali]

        System.out.println(nonDup); // [Vasyl, Sumeye, Ali]

    }
}
