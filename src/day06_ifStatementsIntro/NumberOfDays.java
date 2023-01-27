package day06_ifStatementsIntro;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 2;

        boolean has28Days = number == 2;

        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;

        boolean has31Days = !has30Days && !has28Days;

        String result = "";

        if(has28Days){
            result = "28 days";
        }

        if(has30Days){
            result = "30 days";
        }

        if(has31Days){
            result = "31 days";
        }

        System.out.println(result);
    }
}
