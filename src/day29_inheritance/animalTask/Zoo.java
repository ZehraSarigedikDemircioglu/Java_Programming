package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Dog name", "dog breed", 'F', "small", "white", 2);
        Cat cat = new Cat();
        cat.setInfo("Cat name", "cat breed", 'M', "medium", "brown", 3);
        Tiger tiger  =new Tiger();
        tiger.setInfo("Tiger name", "tiger breed", 'F', "large", "orange", 5);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("----------------------------------------------------------");

        System.out.println(Animal.isAnimal);

       dog.sleep(); // bunlar hepsi dog class dan gelir cunku inherited
       dog.drink();
       dog.eat();

        cat.sleep();
        cat.drink();
        cat.eat();

        tiger.sleep();
        tiger.drink();
        tiger.eat();

        System.out.println("-----------------------------------------------------------");

        dog.bark();
        //cat.bark();  bark() is in Dog class

        cat.meow();
        cat.scratch();
       // dog.scratch();

        tiger.hunt();
       // cat.hunt();

        System.out.println("----------------------------------------------------------");

        System.out.println(dog.getName());
        System.out.println(tiger.getGender());

        System.out.println(dog.getGender());

        dog.setGender('M');

        System.out.println(dog.getGender());

        System.out.println(cat.getSize());
        System.out.println(cat);
        cat.setSize("large");
        System.out.println(cat.getSize());
        System.out.println(cat);

    }
}
