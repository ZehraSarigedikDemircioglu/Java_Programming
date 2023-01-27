package day34_abstraction.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }

    @Override
    public void play() {
        System.out.println("Cat "+getName()+" is playable");
    }
}
