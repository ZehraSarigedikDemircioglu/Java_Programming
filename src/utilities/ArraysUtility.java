package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;

    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static int[] reverse(int[] array) {
        int[] reserve = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reserve[j] = array[i];
        }
        return reserve;
    }

    public static double[] reverse(double[] array) {
        double[] reserve = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reserve[j] = array[i];
        }
        return reserve;
    }

    public static char[] reverse(char[] array) {
        char[] reserve = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reserve[j] = array[i];
        }
        return reserve;
    }

    public static String[] reverse(String[] array) {
        String[] reserve = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reserve[j] = array[i];
        }
        return reserve;
    }

    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static char[] addElement(char[] array, char element) {
        char[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }


    public static boolean contains(int[] array, int element) {

        for (int eachElement : array) {
            if (eachElement == element) {
                return true;
            }
        }
        return false;


    }

    public static boolean contains(double[] array, double element) {

        for (double eachElement : array) {
            if (eachElement == element) {
                return true;
            }
        }
        return false;

    }

    public static boolean contains(String[] array, String element) {

        for (String eachElement : array) {
            if (eachElement.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element) {

        for (char eachElement : array) {
            if (eachElement == element) {
                return true;
            }
        }
        return false;
    }

    public static int[] replace(int[] array, int index, int newElement) {
        for (int i = 0; i < array.length; i++) {
            array[index] = newElement;
        }
        return array;
    }
    public static double[] replace(double[] array, int index, double newElement) {

        for (double i = 0; i < array.length; i++) {
            array[index] = newElement;
        }
        return array;


    }

    public static char[] replace(char[] array, char index, char newElement) {

        for (char i = 0; i < array.length; i++) {
            array[index] = newElement;
        }
        return array;


    }

    public static String[] replace(String[] array, int index, String newElement) {

        for (int i = 0; i < array.length; i++) {
                array[index] = newElement;
        }
        return array;


    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (char i = 0; i < array.length; i++) {
            if(array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static int[] swap(int[] array, int i, int j){

        for (int k = 0; k < array.length; k++) {
            if(array[k] == array[i]){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static double[] swap(double[] array, int i, int j){

        for (int k = 0; k < array.length; k++) {
            if(array[k] == array[i]){
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static char[] swap(char[] array, char i, char j){

        for (char k = 0; k < array.length; k++) {
            if(array[k] == array[i]){
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int i, int j){

        for (int k = 0; k < array.length; k++) {
            if(array[k].equals(array[i])){
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static int[] remove(int[] array, int index){
        int[] newArr1 = Arrays.copyOfRange(array,0,index);
        int[] newArr2 = Arrays.copyOfRange(array, index +1, array.length);

        int [] newArr =  ArraysUtility.merge(newArr1,newArr2);
        return newArr;

    }
    /*

    public static int[] removeDup(int[] array){

    }

     */



}


    