package day34_abstraction.animalTask;

public class Tiger extends Animal implements WildAnimal{


    public Tiger(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+getName() +" is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println("Tiger "+getName() +" is a wild animal");
    }
}
