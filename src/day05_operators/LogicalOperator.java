package day05_operators;

public class LogicalOperator {

    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;  // && and
        int age = 25;

        boolean eligibleForLoan = salary >= 90000 && creditScore >= 650 && age >= 18;

        System.out.println(eligibleForLoan);


        System.out.println("------------------------------------------------");

        age = 18;

        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote);

        System.out.println("--------------------------------------------");

        String answer = "no";  // || or
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);

        System.out.println("---------------------------------------------");

        char grade = 'A';

        boolean passedTheExam = grade == 'A' || grade =='B' || grade == 'C' || grade == 'D';

        System.out.println(passedTheExam);


        System.out.println("--------------------------------------------------");

        System.out.println(true); // true
        System.out.println(!true); // false

        String a = "yes";

        boolean yes = a == "yes"; // true
        boolean no = a != "yes"; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);


        int score = 65;

        boolean passed = score >= 65;
        boolean failed = ! passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("-------------------------------------------");

        System.out.println(true == !false && false == !true && true != !true);

        // true && true && true












    }
}
