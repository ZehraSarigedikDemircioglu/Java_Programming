package day08_ternary_switch;

public class SwitchIntro3 {

    public static void main(String[] args) {

        int score = 95;
        String result = "";

        if(score >= 90){
            result = "A";
        }else if(score >= 80){
            result = "B";
        }else if(score >= 70){
            result = "C";
        }else if(score >= 60){
            result = "D";
        }else{
            result = "F";
        }

        // we can not do it with switch statement since long, boolean can not!!

        // score= 1, score = 2 diye tek tek incelemek gerekir ki hic mantikli degil!!!!






    }
}
