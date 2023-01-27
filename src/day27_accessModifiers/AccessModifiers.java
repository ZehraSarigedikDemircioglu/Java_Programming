package day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 150;

    private static int privateData = 500;

    public AccessModifiers() {

    }

    public static void publicMethod(){
        System.out.println("Public Method");
    }

    protected static void protectedMethod(){
        System.out.println("Protected Method");
    }

    static void defaultMethod(){
        System.out.println("Default Method");
    }

    private static void privateMethod(){
        System.out.println("Public Method");
    }



    public static void main(String[] args) {
        System.out.println(publicData); // same class
        System.out.println(protectedData); // same class
        System.out.println(defaultData); // same class
        System.out.println(privateData); // same class

        new AccessModifiers();
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }



}
