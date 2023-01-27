package day32_finalKeyword;

import java.time.LocalDate;

class CydeoStudent{

    public final void language(){
        System.out.println("Java Programming");
    }
}

public final class FinalKeyword extends CydeoStudent{
    /*

    public void language(){
        System.out.println("Python Programming");
    } // final methods can never be overridden

     */

    public FinalKeyword() {
    }

    public static void main(String[] args) {

        final char gender ='F';
        System.out.println(gender); //F

       // gender = 'M';
        System.out.println(gender); //M

        System.out.println("-------------------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);

        //dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        System.out.println("-------------------------------------------------------");

        new CydeoStudent().language();
        new FinalKeyword().language();

        System.out.println("-------------------------------------------------------");

        final String name = "James";
        //name = null;
        // name = "Daniel";
        System.out.println(name);
    }
}
