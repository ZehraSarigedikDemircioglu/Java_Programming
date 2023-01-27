package day16_nestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "JAVA JavA JaVa JAva";
        String word = "Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

       int count = 0;
       while (sentence.contains(word)){
           count++;
           sentence = sentence.replaceFirst(word,"");
       }
        System.out.println(count);

    }
}
