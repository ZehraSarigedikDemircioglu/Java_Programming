package day34_abstraction.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimmable{

    public Duck(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worm");
    }

    @Override
    public void play() {
        System.out.println("Duck "+getName()+" is playable");
    }

    @Override
    public void fly() {
        System.out.println("Duck "+getName()+" is flyable");
    }

    @Override
    public void swim() {
        System.out.println("Duck "+getName()+" can swim");
    }
}
