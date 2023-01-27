package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 6 ; i++) {

            if(i==4){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------");

        for (int i = 10; i < 21; i++) {

            if(i%2==0){ // bu sayede sadece odd numbers yazar
                continue; // it skips current iteration
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {

            if(i=='B'){   // if(i=='B' || i=='E') da olur
                continue;
            }
            if(i=='E'){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------");

        // find the sum of all the even number 50~100

        for (int i = 50; i <= 100; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i + " "); // yanyana yazdirir bir boslukla
        }
        System.out.println();

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i +" ");
            }
        }
        System.out.println();

        for (int i = 50; i < 101; i += 2) {
            System.out.print(i+" ");
        }

        System.out.println();


/*
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
*/

    }
}
