package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(list); // [Java, Java, Java, C#, C#, Ruby, Swift, Swift, Java]

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("Java")){
                list.set(i, "Python");
            }
        }

        System.out.println(list); // [Python, Python, Python, C#, C#, Ruby, Swift, Swift, Python]

        Collections.replaceAll(list, "Java" , "Python");
        System.out.println(list); // [Python, Python, Python, C#, C#, Ruby, Swift, Swift, Python]

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        int count = Collections.frequency(list2, 50);
        System.out.println(count); // 8

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");
        System.out.println(countJava); // 4

        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        int count1 = Collections.frequency(numbers,1);
        System.out.println(count1); // 0

        for (Integer each : numbers) {
            if(Collections.frequency(numbers, each)==1){
                System.out.println(each); // 10,30
            }
        }




    }
}
