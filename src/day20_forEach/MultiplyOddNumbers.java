package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            if(array[i] %2 == 0){
                continue;
            }
                array[i] = 2 * array[i];
            

            }
        System.out.println(Arrays.toString(array));





    }
}

/*
1. write a program that can multiply each odd number of an integer array by 2
		            ex:
		            	array = [1,2,3,4,5];
	                output:
	                	array =[2,2,6,4,10]
 */
