package com.javaprogramto.arrays.fill;

import java.util.Arrays;

public class ArraysFillExample {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        // filling int values
        Arrays.fill(array1, 9);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[10];
        // filling int values from index 3 to 7
        Arrays.fill(array2, 3, 7, 9);
        System.out.println(Arrays.toString(array2));

        boolean[] array3 = new boolean[10];
        // filling boolean values
        Arrays.fill(array3, true);
        System.out.println(Arrays.toString(array3));

        boolean[] array4 = new boolean[10];
        // filling int values from index 5 to 9
        Arrays.fill(array4, 5,9,true);
        System.out.println(Arrays.toString(array4));

        float[] array5 = new float[10];
        // filling float values
        Arrays.fill(array5, 55.5f);
        System.out.println(Arrays.toString(array5));

        float[] array6 = new float[10];
        // filling int values from index 2 to 7
        Arrays.fill(array6, 2,7,77.7f);
        System.out.println(Arrays.toString(array6));

    }
}
