package day31_inheritanceLast.animal_methodOverriding;

public class Eagle extends Animal{

    public Eagle(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void eat(){
        System.out.println("Eagle " + getName() + " is eating snake");
    }
}
