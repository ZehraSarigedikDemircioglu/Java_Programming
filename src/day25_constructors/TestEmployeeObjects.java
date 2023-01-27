package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Zehra", "SDET", 35, 'F', 100000, LocalDate.of(2023,5,17));
        System.out.println(employee1);

        Employee employee2 = new Employee("Mehmet", "Academician", 39, 'M', 120000, LocalDate.of(2022,8,1));
        System.out.println(employee2);
    }
}
