package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {

    public static void main(String[] args) {

        CydeoDevStudent cydeoDevStudent = new CydeoDevStudent("Daniel", 'M', LocalDate.of(1990,11,1), "A1", "zero to hero", 28);

        System.out.println(cydeoDevStudent);
        cydeoDevStudent.drink();
        cydeoDevStudent.eat();
        cydeoDevStudent.breath();
    }
}
