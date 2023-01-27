package day10_scannerContinueAndStringIntro;



public class GradeLevelSwitch {

    public static void main(String[] args) {


        byte gradeLevel = 25;
        String result ="";

        switch(gradeLevel){
            case 1:
                result = "Elementary School";
                break;
            case 2:
                result = "Elementary School";
                break;
            case 3:
                result = "Elementary School";
                break;
            case 4:
                result = "Elementary School";
                break;
            case 5:
                result = "Elementary School";
                break;
            case 6:
                result = "Middle School";
                break;
            case 7:
                result = "Middle School";
                break;
            case 8:
                result = "Middle School";
                break;
            case 9:
                result = "High School";
                break;
            case 10:
                result = "High School";
                break;
            case 11:
                result = "High School";
                break;
            case 12:
                result = "High School";
                break;
            case 13:
                result = "College";
                break;
            case 14:
                result = "College";
                break;
            case 15:
                result = "College";
                break;
            case 16:
                result = "College";
                break;
            case 17:
                result = "Grad School";
                break;
            case 18:
                result = "Grad School";
                break;
            default:
                result = "Invalid Grade";

        }
        System.out.println(result);
    }
}
