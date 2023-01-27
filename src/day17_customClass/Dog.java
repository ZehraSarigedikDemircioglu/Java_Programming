package day17_customClass;

public class Dog {

    public String name;  // instance variable
    public String breed;
    public char gender;
    public int age;
    public String color;
    public String size;

    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        this.name = name; // this keyword is used for calling the instance variable name
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.size = size;

        // this method can help us to set all the information of the dog at once

    }

    public void eat(){
        System.out.println(name + " is eating dog food");
    }
    public void drink(){
        System.out.println(name + " is drinking water");
    }


    public String toString() { // to avoid getting hash-code
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
