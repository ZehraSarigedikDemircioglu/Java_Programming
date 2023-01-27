package day08_ternary_switch;

public class TernariesIntro3 {
    public static void main(String[] args) {

        int score = 65;

        /*
        String result= "";
        if(score >= 0 && score <= 100){
            if(score >= 60){
                result="Passed";
            }else{
                result="Failed";
            }

        }else{
            result = "Invalid";
        }
        System.out.println(result);

        */

        System.out.println("-----------------------------------------------");

        String result = (score >= 0 && score <= 100)?
                (score >= 60)?"Passed":"Failed"
                :"Invalid";

        System.out.println(result);

        System.out.println("-------------------------------------------------");

        int n = 8;

        String day = (n>=1 && n<=7)?
                (n==1)?"Monday":(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday"
                        :(n==5)?"Friday":(n==6)?"Saturday":"Sunday"
                : "Invalid";

        System.out.println(day);



    }
}
