package day22_arrayList;

import java.util.ArrayList;

public class ArrayListIterating {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255); // {100, 200, 300, 255, 400, 500}
        // numbers.add(300, 2000); // can not skip index. out ofBoundException

        System.out.println(numbers);

        System.out.println("-------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i);
            System.out.println(each);
        }

        System.out.println("-------------------------------------------------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            int reverseEach = numbers.get(i);
            System.out.println(reverseEach);
        }

        System.out.println("-------------------------------------------------");

        for (Integer eachElement : numbers) {
            System.out.println(eachElement);
        }


    }
}
