package day26_statics;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("name1");
        Employee employee2 = new Employee("name2", 'F');
        Employee employee3 = new Employee("name3", 'M', "jobtitle1");
        Employee employee4 = new Employee("name4", 'F', "jobtitle2", 100000);
        Employee employee5 = new Employee("name5", "jobtitle3");
        Employee employee6 = new Employee("name6", "jobtitle4", 120000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);

    }


}
