package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991,1,25));
        System.out.println(person);

        person.breath();

        System.out.println("-----------------------------------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 2, 5), "Accountant", 100000);
        System.out.println(employee);

        employee.breath();

        System.out.println("-----------------------------------");

        Student student = new Student("Adam", 'M', LocalDate.of(2000, 3, 12), 'D');
        System.out.println(student);

        UnderGraduateStudent underGraduateStudent = new UnderGraduateStudent("Daniel", 'M', LocalDate.of(2020, 3, 12), 'D');
        GraduateStudent graduateStudent = new GraduateStudent("Sara", 'F', LocalDate.of(1988, 5, 10), 'C');
        CydeoStudent cydeoStudent = new CydeoStudent("Mary", 'F', LocalDate.of(1991, 2, 23), 'A', 28, "Java");

        System.out.println(underGraduateStudent);
        System.out.println(graduateStudent);
        System.out.println(cydeoStudent);


    }
}
