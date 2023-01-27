package day25_constructors;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Zehra", 35, 'F', LocalDate.of(1989, 11, 22), true, false);
        Person person2 = new Person("Mehmet", 39, 'M', LocalDate.of(1981, 10, 22), true, true);

        System.out.println(person1);
        System.out.println(person2);

        person1.eat("pasta");
        person1.sleeping();
        person1.drink("ayran");

        person2.eat("chicken");
        person2.sleeping();
        person2.drink("tea");
    }

}
