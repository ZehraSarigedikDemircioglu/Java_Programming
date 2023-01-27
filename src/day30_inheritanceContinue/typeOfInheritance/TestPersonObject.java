package day30_inheritanceContinue.typeOfInheritance;

import java.sql.PreparedStatement;
import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {


        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5, 16), 'A', "A01");
        President president = new President("Daniel", 'M', LocalDate.of(1980, 12, 1),LocalDate.of(2020, 1, 1));
        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "C1", "Math Teacher", 95000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        president.lie();
        teacher.teach();

        System.out.println("-------------------------------------------------");

        student.drink("ayran");
        teacher.eat("pasta");

        president.drink("water");
        teacher.drink("juice");




    }
}
