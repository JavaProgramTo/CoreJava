package com.javaprogramto.arrays.setall;

import java.util.Arrays;

public class LongArraySetAllExample {

    public static void main(String[] args) {

        // Creating a long array with default values
        long[] longArray = new long[7];

        System.out.println("original long array with default values : "+ Arrays.toString(longArray));

        // setting values to longArray using setAll() method
        Arrays.setAll(longArray, i -> i + 10 * 20);

        System.out.println("Long array.setAll(long) output: "+ Arrays.toString(longArray));
    }
}
