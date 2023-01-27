package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();
       // student.age = -200;

        student.setAge(25);

        System.out.println(student.getAge());
        System.out.println("Test Completed");

        //student.name;

        //student.setName();
        System.out.println(student.getName());


    }
}
