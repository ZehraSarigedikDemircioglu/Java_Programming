package day25_constructors;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("Object is created by using default constructor");
    }

    public ConstructorsIntro(int a){
        System.out.println("Object is created by using int argument constructor");
    }

    public void add(){

    }

    public static void main(String[] args) {

        ConstructorsIntro obj = new ConstructorsIntro();
        ConstructorsIntro obj2 = new ConstructorsIntro();
        ConstructorsIntro objWithArg1 = new ConstructorsIntro(10);
        ConstructorsIntro objWithArg2 = new ConstructorsIntro(10);
        ConstructorsIntro objWithArg3 = new ConstructorsIntro(10);
       // ConstructorsIntro objWithArg4 = new ConstructorsIntro("Java");
    }







}
