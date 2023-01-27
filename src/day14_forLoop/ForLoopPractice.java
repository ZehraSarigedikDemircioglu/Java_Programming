package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {


        for (int i = 5; i <= 10; i++) { // 6 times
            System.out.println("Hello World");
        }

        for (int i = 10; i > 5; i--) { // 5 times
            System.out.println("Hello Cydeo" + i);
        }

        System.out.println("--------------------------------------------------");

        int sum=0;

        for (int i = 1; i <= 100; i++) {
           sum+= i;
        }
        System.out.println(sum);

        System.out.println("--------------------------------------------------");


        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // yukarda tek sira halinde yazildi,
        // eger bosluk biraktirmazsam yanina devam eder bu sirdaki yani ilk siradaki

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }






    }
}
