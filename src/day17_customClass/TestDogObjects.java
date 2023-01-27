package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.gender = 'M';
        dog1.color = "Brown";
        dog1.size = "Large";




        Dog dog2 = new Dog();
        dog2.name = "Loki";
        dog2.breed = "Golden";
        dog2.age = 3;
        dog2.gender = 'F';
        dog2.color = "White";
        dog2.size = "Small";

        Dog dog3 = new Dog();
        dog3.setInfo("Bili", "Chow", 'M', 6, "Medium", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Chuck", "Bulldog", 'F', 5, "Small", "Gray");


        System.out.println(dog2);
        System.out.println(dog1);
        System.out.println(dog3);
        System.out.println(dog4);

        dog1.eat();
        dog3.drink();

    }
}
