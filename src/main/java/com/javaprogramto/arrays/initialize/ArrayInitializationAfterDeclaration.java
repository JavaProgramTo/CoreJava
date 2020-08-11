package com.javaprogramto.arrays.initialize;

public class ArrayInitializationAfterDeclaration {

    public static void main(String[] args) {

        // Example 1
        // int array declaration
        int[] intArray;

        // Array initialization
        intArray = new int[]{10, 20, 30, 40, 50};

        System.out.println("Printing array values : ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Example 2

        // Boolean array declaration
        boolean[] booleanArray ;

        // boolean array initialization
        booleanArray = new boolean[]{true, false, true};

        System.out.println("Printing boolean array : ");
        for(int index = 0;index < booleanArray.length; index++){
            System.out.println(booleanArray[index]);
        }
    }
}
