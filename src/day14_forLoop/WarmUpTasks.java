package day14_forLoop;

public class WarmUpTasks {

    public static void main(String[] args) {


        String word3 = combine("one", "eight");
        System.out.println(word3);
        System.out.println(combine("one", "two"));

        int num3 = sumOfTwoIntegerNumbers(3,5);
        System.out.println(num3);

        System.out.println(sumOfTwoIntegerNumbers(10,20));
        System.out.println(sumOfThreeIntegerNumbers(10,20,30));
        System.out.println(sumOfFourIntegerNumbers(10,20,30,40));
    }


    public static String combine(String word1, String word2) {
        String result;

        if (word1.endsWith("" + word2.charAt(0))) {
            result = word1 + word2.substring(1);
        } else {
            result = word1 + word2;
        }
        return result;

    }

    public static int sumOfTwoIntegerNumbers(int num1, int num2){

        return num1 + num2;

    }

    public static int sumOfThreeIntegerNumbers(int num1, int num2, int num3){
        // return num1 + num2 + num3;
        return sumOfTwoIntegerNumbers(num1,num2)+num3;
    }
    public static int sumOfFourIntegerNumbers(int num1, int num2, int num3, int num4){
        // return num1 + num2 + num3 + num4;
        // return sumOfThreeIntegerNumbers(num1, num2, num3) + num4;
        // return sumOfTwoIntegerNumbers(num1, num2) + sumOfTwoIntegerNumbers(num3, num4);
        // return sumOfTwoIntegerNumbers(sumOfThreeIntegerNumbers(num1, num2, num3), num4);
        return sumOfThreeIntegerNumbers(sumOfTwoIntegerNumbers(num1, num2), num3, num4);


    }
}
