package com.javaprogramto.arrays.initialize;

public class ArrayInitializationWithoutNewKeyword {

    public static void main(String[] args) {

        // Example 1
        // int array declaration and intialization without new keyword
        int[] intArray = {2, 4, 6, 8, 20};

        System.out.println("Printing array values : ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Example 2

        // Boolean array declaration and intialization without new keyword
        boolean[] booleanArray = {true, false, true};

        System.out.println("Printing boolean array : ");
        for (int index = 0; index < booleanArray.length; index++) {
            System.out.println(booleanArray[index]);
        }

        // Example 3

        // Double array declaration and intialization without new keyword
        double[] salaryArray = {15000, 35000, 50000};

        System.out.println("Printing salary double array : ");
        for (int index = 0; index < salaryArray.length; index++) {
            System.out.println(salaryArray[index]);
        }
    }
}
