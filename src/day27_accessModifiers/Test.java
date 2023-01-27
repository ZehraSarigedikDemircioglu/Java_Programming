package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

       // new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);


        System.out.println("-----------------------------------------------");

        System.out.println(AccessModifiers.publicData); // same package
        System.out.println(AccessModifiers.protectedData); // same package
        System.out.println(AccessModifiers.defaultData); // same package
        //System.out.println(AccessModifiers.privateData); // not accessible

        new AccessModifiers();
        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();


    }
}
