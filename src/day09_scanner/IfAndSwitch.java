package day09_scanner;

public class IfAndSwitch {

    public static void main(String[] args) {

        int number = 75;

        if(number==50 || number==75 || number==100){
            switch (number){
                case 50:
                    System.out.println("20 crew");
                    break;
                case 75:
                    System.out.println("25 crew");
                    break;
                default:
                    System.out.println("30 crew");
            }


        }else{
            System.out.println("invalid");
        }
    }
}
