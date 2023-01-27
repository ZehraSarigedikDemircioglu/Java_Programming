package day10_scannerContinueAndStringIntro;

public class GradeLevelIfAndSwitch {

    public static void main(String[] args) {

        byte grade = 19;
        String result = "";

        if(grade >=1 && grade <=18){
            if(grade <= 5){
                switch (grade){
                    case 1: case 2: case 3: case 4: case 5:
                            result = "Elementary";
                            break;
                }
            }else if(grade <=8){
                switch (grade){
                    case 6: case 7: case 8:
                        result = "Middle";
                        break;
                }
            }else if(grade <= 12){
                switch (grade){
                    case 9: case 10: case 11: case 12:
                        result = "High";
                        break;
                }
            }else if(grade <=16){
                switch (grade){
                    case 13: case 14: case 15: case 16:
                        result ="College";
                        break;
                }
            }else{
                switch (grade){
                    default:
                        result="Grad";
                }
            }


        }else{
            result = "Invalid";
        }
        System.out.println(result);
    }
}
