package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {


        // Person person1 = new Person();
        // person1.setInfo("Zehra", 'F', LocalDate.of(1990-11-05));

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Zehra", 'F', LocalDate.of(1990,11,5));
        people[1].setInfo("Mehmet", 'F', LocalDate.of(1980,10,13));
        people[2].setInfo("Akif", 'F', LocalDate.of(1925,5,9));
        people[3].setInfo("Yusuf", 'F', LocalDate.of(2010,3,25));
        people[4].setInfo("Ali", 'F', LocalDate.of(1970,6,8));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));
        System.out.println(studentsList);

        studentsList.removeIf(p -> p.age>55);

        for (Person each : studentsList) {
            System.out.println(each.name + ": " + each.dateOfBirth);
        }


    }
}
