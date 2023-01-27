package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Tester extends Employee{

    public Tester(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing");
    }
}
