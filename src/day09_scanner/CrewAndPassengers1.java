package day09_scanner;

public class CrewAndPassengers1 {

    public static void main(String[] args) {

        int total = 50;

        String result = (total == 50 || total == 75 || total == 100)?
                (total == 50) ? "20 crew": (total == 75)? "25 crew" : "30 crew"
                :"Invalid";

        System.out.println(result);
    }
}
