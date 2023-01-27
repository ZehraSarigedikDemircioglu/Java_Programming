package day28_encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Aaron");
        Person person2 = new Person("Mary", 42);
        Person person3 = new Person("Molly", "English");
        Person person4 = new Person("David", 'M');
        Person person5 = new Person("Sarah", 31, 'F');
        Person person6 = new Person("Titany", 52, 'F', "Spanish");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person3.eat("pasta");

        person5.drink("milk");
    }
}
