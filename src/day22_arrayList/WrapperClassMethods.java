package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1); //201

        // Integer num1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str); //

        System.out.println(num + 1); // 21

        Integer num2 = Integer.valueOf(str); // wrapperdan wrappere

        System.out.println(num2 + 1); // 21

        System.out.println("-----------------------------------------------");

        String s = "20.5";

        double d1 = Double.parseDouble(s);
        Double d2 = Double.valueOf(s);

        System.out.println(d1);
        System.out.println(d2);


        System.out.println("-----------------------------------------------");

        String x = "true";
        boolean b1 = Boolean.parseBoolean(x);
        Boolean b2 = Boolean.valueOf(x);

        System.out.println(b1);
        System.out.println(b2);

        System.out.println("-----------------------------------------------");

        char ch = '@';

        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit:" + isDigit);

        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        System.out.println("isLetter: " + isLetter);
        System.out.println("isLowerCase: " + isLowerCaseLetter);
        System.out.println("isUpperCase: " + isUpperCaseLetter);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character
        System.out.println("isSpecial: " + isSpecialChar);

        System.out.println("-----------------------------------------------");

        String string = "a1b2c3d4";

        int sum = 0;

        for (char each : string.toCharArray()) {
            if(Character.isDigit(each)){
               sum += Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);


    }

}
