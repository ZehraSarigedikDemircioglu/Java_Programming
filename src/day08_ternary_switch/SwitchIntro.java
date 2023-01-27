package day08_ternary_switch;

import java.sql.SQLOutput;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'Q';
        String result = "";

        if(grade == 'A'){
            result = "excellent";
        }else if(grade == 'B'){
            result = "great job";
        }else if(grade == 'C'){
            result = "good";
        }else if(grade == 'D'){
            result = "passed";
        }else{
            result = "failed";
        }
        System.out.println(result);

        System.out.println("-------------------------------------------------");

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;

            case  'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
                // defaulttan sonra break gerek yok last ise, ama diger turlu birak yoksa sonraki sirayi da yazdirir

        }






        /*
        A : Excellent
        B : Great Job
        C : Good
        D : Passed
        F : Failed
         */



    }


}
