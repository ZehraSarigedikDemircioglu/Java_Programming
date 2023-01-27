package day13_customMethodsContinue;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        int total = sum(5,7);

      //  int total = sum(5,7); // void method and does not return any data

        int t = square(5);

        //System.out.println(square(5));  her ikisi de olur amacina gore yap

        System.out.println(t);

        System.out.println(cube(5));

    }
/*
    public static void sum(int n1, int n2){

        int result = n1 + n2;
        System.out.println(result);

    }
*/

    public static int sum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int square(int num){
        int square = num * num;
        return square;
    }

    public static int cube(int num){
        int cube = square(num) * num;
        return cube;
    }


}
