package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan", "Bengal", "Large", "Orange", 5, 'M');

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();

        Animal animal = new Eagle("John", "American Eagle", "Small", "Black & White", 3, 'M');
        // animal.fly();
        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1  = new Eagle("John", "American Eagle", "Small", "Black & White", 3, 'M');
        //obj1.eat();
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = new Dog("name", "breed", "size", "color", 3, 'F');

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot, eagle, duck};

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};

        boolean isAnimal =  dog instanceof Animal ;
        System.out.println(isAnimal);

        System.out.println("------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);


    }
}
