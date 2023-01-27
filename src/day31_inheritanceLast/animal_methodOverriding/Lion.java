package day31_inheritanceLast.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, String size, String color, char gender, int age, boolean isAfricanLion) {
        super(name, breed, size, color, gender, age);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar(){
        System.out.println("Lion " + getName() + " is roaring");
    }

    public String toString() {
        return  super.toString().replace("}", "") +
                ", African lion='" + isAfricanLion + '\'' +
                '}';
    }
}
