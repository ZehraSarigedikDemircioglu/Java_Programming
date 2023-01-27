package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

       // char ch = str.charAt(0); // a

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length() ; i++) { // checks how many time the ch appear th str
                if(str.charAt(i) == ch){
                    frequency++;
                }
            }
            if(frequency==1){
                unique+=ch;
            }
        }

        System.out.println(unique);






    }
}
/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"
				output:
					bd
 */