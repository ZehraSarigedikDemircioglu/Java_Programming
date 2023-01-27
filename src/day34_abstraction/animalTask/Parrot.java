package day34_abstraction.animalTask;

public class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Parrot "+getName()+" is eating seeds");
    }

    @Override
    public void play() {
        System.out.println("Parrot "+getName()+" is playable");
    }

    @Override
    public void fly() {
        System.out.println("Parrot "+getName()+" is flyable");
    }
}
