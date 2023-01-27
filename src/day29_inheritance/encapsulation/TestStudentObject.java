package day29_inheritance.encapsulation;

import day29_inheritance.encapsulation.Student;

public class TestStudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Name1", 25, 'F', 'A', "Cydeo School");
       // Student student2 = new Student("Name2", -25, 'F', 'A', "Cydeo School");
        //Student student3 = new Student("Name3", 25, 'X', 'A', "Cydeo School");
       // Student student4 = new Student("Name4", 25, 'F', 'X', "Cydeo School");
       // Student student5 = new Student("", 25, 'F', 'B', "Cydeo School");
        Student student6 = new Student("Name6", 24, 'M', 'F', "");

        System.out.println(student1);
       // System.out.println(student2);
        //System.out.println(student3);
       // System.out.println(student4);
       // System.out.println(student5);
        System.out.println(student6);
        student6.setSchoolName("MIT");
        System.out.println(student6);

    }
}
