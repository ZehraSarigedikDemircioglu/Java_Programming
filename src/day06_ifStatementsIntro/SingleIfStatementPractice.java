package day06_ifStatementsIntro;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 45;

        boolean isEven = number % 2 == 0;

        if(isEven){ // boolean yazmadan if(number % 2 == 0) seklinde yaptim oldu
            System.out.println(number + " is even number");
        }

        if(!isEven){
            System.out.println(number + " is odd number");
        }

        System.out.println("-----------------------------------------------------");

        if(number % 2 == 0){ // boolean yazmadan if(number % 2 == 0) seklinde yaptim oldu
            System.out.println(number + " is even number");
        }

        if(number % 2 != 0){
            System.out.println(number + " is odd number");
        }
    }
}
