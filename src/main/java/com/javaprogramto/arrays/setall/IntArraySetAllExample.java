package com.javaprogramto.arrays.setall;

import java.util.Arrays;

public class IntArraySetAllExample {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        System.out.println("original array : "+ Arrays.toString(intArray));

        Arrays.setAll(intArray, i -> (i + 1) * 2);

        System.out.println("array.setAll() output: "+ Arrays.toString(intArray));
    }
}
