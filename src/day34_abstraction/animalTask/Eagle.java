package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{

    public Eagle(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }

    @Override
    public void fly() {
        System.out.println("Eagle "+getName()+" is flyable");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle "+getName()+" is a wild animal");
    }
}
