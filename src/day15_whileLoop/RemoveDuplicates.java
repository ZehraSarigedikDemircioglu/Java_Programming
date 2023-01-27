package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "xxxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyzzzzzzzzzxyz";

        String result = "";  // "abc"

        for (int i = 0; i < str.length(); i++) {  // i: index numbers of str
            char each = str.charAt(i);

            if(!result.contains(""+each)){ // if String result does ot contain the character of String str yet
                result+=each; // then we will add the character to string result
            }
        }
        System.out.println("result = " + result);

    }
}
/*
Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */
