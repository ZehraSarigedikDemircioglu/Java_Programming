package day16_nestedLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        char ch = 'c';

        int count = 0;
        for (char i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
        }
        }

        System.out.println(count);
    }
}
