package day11_stringContinue;

import java.sql.SQLOutput;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);

        String word = "java";
        word = word.replace('a', 'e');
        System.out.println(word);  //jeve


        System.out.println("----------------------------------------------------------");

        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replaceFirst("Java", "Python");
        System.out.println(sentence2);

        System.out.println("----------------------------------------");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        sentence3 = sentence3.replaceFirst(" Java", " Python");

        System.out.println(sentence3);

        System.out.println("-------------------------------------------------------");

        String sentence4 = "I love Java Programming";
        String languageName = sentence4.substring(7, 10 + 1);
        System.out.println(languageName);

        System.out.println("-------------------------------------------------------");

        String sentence5= "Today is Sunday, Tomorrow is Monday";
        //                 0123456789............
        String today = sentence5.substring(9, 14+1);
        System.out.println(today);

        System.out.println("----------------------------------------------------------");

        String email = "CydeoSchoolJavaProgramming@yahoo.com";
        int beginning = email.indexOf('@')+1;
        int ending = email.lastIndexOf('.');

        String findWord = email.substring(beginning, ending);
        System.out.println(findWord);

        System.out.println("------------------------------------------------------------");

        String sentence6 = "I love Java Programming";

        // String r1= sentence6.substring(7,sentence6.length());
        String r1= sentence6.substring(7);
        System.out.println(r1);

        System.out.println("---------------------------------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday"; // Monday
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1);
        System.out.println(tomorrow);

        System.out.println("------------------------------------------------------");

        String sentence8 = "I study at Cydeo School";  // Cydeo School

        String schoolName = sentence8.substring(sentence8.lastIndexOf(" C")+1);
        System.out.println(schoolName);

        System.out.println("------------------------------------------------------");

        String str = "Python";
        String result = (str + "\n").repeat(10);
        System.out.println(result);












    }
}
