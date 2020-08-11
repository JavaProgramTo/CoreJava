package com.javaprogramto.arrays.fill;

public class FillArrayExampleCustom {

    public static void main(String[] args) {

        System.out.println("Array 1");
        int[] array1 = fillArray(5, 10);
        printArray(array1);

        System.out.println("Array 2");
        int[] array2 = fillArray(10, 25);
        printArray(array2);


    }
    private static int[] fillArray(int size, int valueToBeFilled){

        // Creating an array
        int[] intArray = new int[size];

        // setting the value to each index in the array
        for(int i =0;i<intArray.length; i++){
            intArray[i] = valueToBeFilled;
        }

        return intArray;
    }

    private static  void printArray(int[] array){

        System.out.println("\n");

        // printing the array
        for (int i = 0;i< array.length;i++){
            System.out.print(" "+array[i] );
        }

    }
}
