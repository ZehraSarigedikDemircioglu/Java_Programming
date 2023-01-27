package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;

    public Student(String name, char gender, LocalDate dateOfBirth, char grade) {
        super(name, gender, dateOfBirth);
        setGrade(grade);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if(!(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')){
            System.err.println("Invalid grade " + grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", grade=" + grade +
                '}';
    }
}
