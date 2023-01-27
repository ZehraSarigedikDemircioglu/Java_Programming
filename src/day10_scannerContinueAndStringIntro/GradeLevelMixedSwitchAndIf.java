package day10_scannerContinueAndStringIntro;

public class GradeLevelMixedSwitchAndIf {

    public static void main(String[] args) {

        byte gradeLevel = 1;
        String result = "";

        if (gradeLevel >= 1 && gradeLevel <= 18) {
            switch (gradeLevel) {

                case 6: case 7: case 8:
                    result = "Middle";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "High";
                    break;
                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;
                case 17: case 18:
                    result = "Grad";
                    break;
                default:
                    result = "Elementary";
            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }



}
