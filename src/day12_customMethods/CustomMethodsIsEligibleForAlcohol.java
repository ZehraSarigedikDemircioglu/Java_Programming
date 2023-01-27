package day12_customMethods;

public class CustomMethodsIsEligibleForAlcohol {

    public static void main(String[] args) {

isEligibleForAlcohol(30);
isEligibleForAlcohol(20);
    }

    public static void isEligibleForAlcohol(int age){

        if(age>=21){
            System.out.println("Age " + age + " is eligible to buy alcohol");
        }else{
            System.out.println("Age " + age + " is not eligible to buy alcohol");
        }
    }
}
// create a method that can check if a person is eligible to buy alcohol  (age)