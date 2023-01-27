package day26_statics;

import java.util.concurrent.Callable;

public class ConstructorCalls {

    public ConstructorCalls(){
        // this();
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
       // this(); consructor call has to be at the first step
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this();
       // this(2.5); it can not call more than one
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        method1();

        System.out.println("--------------------------------------------");

        method2();


    }

    public static void method1(){
        // ConstructorCalls();
        // this();
        System.out.println("Method 1");
    }
    public static void method2(){
        method1();
        System.out.println("Method 2");
        method2();
    }
}
