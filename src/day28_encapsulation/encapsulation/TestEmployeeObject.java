package day28_encapsulation.encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {

        /*

        Employee employee1 = new Employee();
        employee1.setSalary(200000);

        System.out.println(employee1.getSalary());

       // employee1.setName("              ");
        System.out.println(employee1.getName());

         */

        Employee employee1 = new Employee("Aaron", 35, "SDET", 150000);
        Employee employee2 = new Employee("Sarah", 36, "Java Developer", 200000);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
