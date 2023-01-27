package day31_inheritanceLast;

import java.security.PublicKey;

class A{

    public int a = 100;
}

public class FieldHiding extends A{

    public int a = 10; // child class variable prints, parent class variable is hiding

    public static void main(String[] args) {

        System.out.println(new FieldHiding().a);
    }


}
