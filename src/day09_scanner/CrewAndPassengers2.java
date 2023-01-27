package day09_scanner;

public class CrewAndPassengers2 {

    public static void main(String[] args) {

        int total = 80;
        String result;

        switch (total){
            case 50:
                result = "20 crew";
                break;
            case 75:
                result = "23 crew";
                break;
            case 100:
                result = "20 crew";
                break;
            default:
                result = "invalid";

        }

        System.out.println(result);
    }
}
