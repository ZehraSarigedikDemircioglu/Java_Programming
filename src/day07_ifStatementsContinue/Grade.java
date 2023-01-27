package day07_ifStatementsContinue;

public class Grade {

    public static void main(String[] args) {
        char name = 'A';
        String result = "";

        if(name == 'A'){
            result = "Excellent";
        }
        if(name == 'B'){
            result = "Great Job";
        }
        if(name == 'C'){
            result = "Good";
        }
        if(name == 'D'){
            result = "Passed";
        }
        if(name == 'F'){
            result = "Failed";
        }
        System.out.println(result);


    }
}
/*
Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed
        Note: Do not use more than one print statement
 */
