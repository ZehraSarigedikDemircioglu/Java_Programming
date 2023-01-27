package day12_customMethods;

public class CustomMethodsInitials {

    public static void main(String[] args) {

        initials("cydeo", "school");

        initials("zehra", "sarigedik");

        initials("java", "class");


    }

    public static void initials(String firstName, String lastName){

        String initials =  firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();

        System.out.println(initials);
    }
}
//Create a method that can display the initials of a person  (firstName, lastName)

        /*
        firstname = "Cydeo"
        lastname = "School"
        initial ==> C.S
         */