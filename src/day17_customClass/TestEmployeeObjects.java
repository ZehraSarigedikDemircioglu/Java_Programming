package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("Zehra",35, 'F', "Java Developer", 95000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Mehmet", 40, 'M', "Academician", 100000, "Y15");

        Employee employee3 = new Employee();
        employee3.setInfo("Yusuf", 24, 'M', "Master", 50000, "C10");

        employee2.age = 39; // eger yanlis bilgi varsa boyle degistirilebilir
        employee3.name = "Yusuf Ali";
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();

    }
}
