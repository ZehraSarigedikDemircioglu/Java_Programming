package day34_abstraction.animalTask;

public class Lion extends Animal implements WildAnimal{

    public Lion(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating buffalo");
    }

    @Override
    public void hunt() {
        System.out.println("Lion "+getName()+" is a wild animal");
    }
}
