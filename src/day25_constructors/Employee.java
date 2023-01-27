package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary;
    public LocalDate hiredDate;

    public Employee(String name, String jobTitle, int age, char gender, double salary, LocalDate hiredDate) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredDate = hiredDate;
    } // allows us to set all the instance variables of the object as soon as the object is created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y"))+
                '}';
    } // allows us to print the object when its passed in the print statement
}


/*
name
age
gender
jobTitle
salary
hired date
 */
