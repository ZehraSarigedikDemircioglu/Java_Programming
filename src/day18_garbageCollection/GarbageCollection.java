package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "Java";
        System.out.println(s1); // Java
        s1 = null;
        System.out.println(s1); // null

        // "Java" will be eligible for garbage collection


       // System.out.println(s1.toUpperCase()); // null pointer exception

       // System.out.println(s1.replace(null, "Python")); // null pointer exception

        String a = ""; // even it is empty, but is exist in the heap yani bu object
        String b = null;  // it is not exist


        System.out.println("-----------------------------------------------");

        String str1 = "Python";  // python is no longer object, so garbage collection
        str1 = "CYDEO";

        System.out.println(str1);

        System.out.println("-----------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Bili", "Chow", 'M', 6, "Medium", "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        // dog1 = null; // 1. secenek garbage collection icin

        dog1 = dog2; // 2. secenek garbage collection icin

        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalize();














    }
}
