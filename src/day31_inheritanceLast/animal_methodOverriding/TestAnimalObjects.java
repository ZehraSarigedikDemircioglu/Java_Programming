package day31_inheritanceLast.animal_methodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bangle", "Small", "Gray", 'F', 4);

        Dog dog = new Dog("Max", "Husky", "Large", "White", 'M', 3);

        Lion lion = new Lion("Simba", "African Lion", "Large", "Yellow", 'M', 6, true);

        Eagle eagle = new Eagle("Bella", "American Eagle", "Medium", "Black & White",  'F', 4);


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("--------------------------------------------------------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        System.out.println("----------------------------------------------------------");


        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();

    }
}
