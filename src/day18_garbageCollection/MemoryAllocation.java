package day18_garbageCollection;

import day17_customClass.Employee;

class Car{

    public String color;
    public String brand;
    public String model;
    public int year;

}

public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // stack

        Car car = new Car();
        //  stack      in the heap

        System.out.println("---------------------------");

        Employee employee1 = new Employee(); // object olan new olan Employee oluyor
        Employee employee2 = employee1;
        // employee1, employee2 in stack , but 1 is in the heap

        employee1.setInfo("Rahan", 30, 'F',"SDET", 85000, "A12"); // one object

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("---------------------------");

        String batch1 = new String("Java");
        String batch2 = new String("Java");
        String batch3 = new String("Java");
        //              3 objects in the heap
        // 3 referance name
        // bunun mantigi yok, efficient degil

       // String batch1 = new String("Java");
        //String batch2 = batch1;
        //String batch3 = batch1;
        //              only 1 object in the heap
        // 3 referance name
        // benefit olan bu, 1 tane heap yeter, kac tane referance name yani stackta istersen olur
        // 3 doors, 1 room. Hangi kapiyi kullanirsan kullan, ayni odaya cikacaktir!



    }

    public static void method1(){

        int b = 200; // stack

    }
    public static void method2(){

        String c = "Hello World";   // in the pool, in the heap
        //   stack     heap
        String d = new String("Hello World"); //  outside pool, in the heap
        //    stack             heap

    }


}
