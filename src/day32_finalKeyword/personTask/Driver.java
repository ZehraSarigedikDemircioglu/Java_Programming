package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Driver extends Employee{

    public Driver(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
