package day35_polymorphism;

import day30_inheritanceContinue.typeOfInheritance.Teacher;
import day31_inheritanceLast.shape_methodOverriding.Circle;
import day32_finalKeyword.personTask.Developer;
import day32_finalKeyword.personTask.Driver;
import day32_finalKeyword.personTask.Tester;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", "Small", "White", 4, 'M');

        Cat cat = new Cat("Max", "Husky", "Small", "White",  4, 'M');

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;


        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        Animal animal = new Dog("Max", "Husky", "Small", "White",  4, 'M');
        animal.eat();
        animal.drink();
        animal.sleep();

        //animal.play();
        //animal.bark();

        System.out.println("---------------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);
/*
        Teacher teacher = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);
 */

        Object[] objects = {str, n, r, d, circle, honda, audi, tesla};

        System.out.println(Arrays.toString(objects));
/*
        Object[] employees = {teacher, developer, driver, tester};
        Employee obj = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);
        obj.work(); */





    }
}
