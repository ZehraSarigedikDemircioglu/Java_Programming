package day32_finalKeyword.personTask;

import java.time.LocalDate;

public final class Developer extends Employee{

    public Developer(String name, char gender, LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName() + " is coding");
    }
}
