package day34_abstraction.animalTask;

public class Shark extends Animal implements WildAnimal, Swimmable{

    public Shark(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Shark " +getName()+" is eating fish");
    }

    @Override
    public void hunt() {
        System.out.println("Shark " +getName()+" is a wild animal");
    }

    @Override
    public void swim() {
        System.out.println("Shark " +getName()+" can swim");
    }
}
