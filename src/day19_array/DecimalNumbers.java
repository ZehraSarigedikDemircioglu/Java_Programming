package day19_array;

import java.text.DecimalFormat;

public class DecimalNumbers {

    public static void main(String[] args) {

        double n1 = 10.587654;

        //DecimalFormat df = new DecimalFormat("0.00"); // 10.59

        //DecimalFormat df = new DecimalFormat("0.000"); // 10.588

        DecimalFormat df = new DecimalFormat("0.0"); // 10.6

        System.out.println(df.format(n1));
    }
}
