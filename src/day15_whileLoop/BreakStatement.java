package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {

            if (i == 6) { // if i's value reaches 6, then exit the loop
                break;
            }
            System.out.println(i);
        }

        System.out.println("---------------------------------------------------------");

            for (char i = 'A'; i <= 'Z'; i++) {

                if(i == 'J'){ // char I
                    break;
                }
                System.out.println(i);
              //  if(i == 'J'){ // char J
             //       break;
               // }
            }

            System.out.println("---------------------------------------------------------");

            for (;;){
                System.out.println("Hello");
                break;
                // System.out.println("World"); // break den sonra yazilmaz
            }

        }
    }
