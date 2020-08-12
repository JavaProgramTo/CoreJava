package com.javaprogramto.arrays.setall;

import java.util.Arrays;

public class DoubleArraySetAllExample {

    public static void main(String[] args) {

        // Creating a double array with default values
        double[] doubleArray = new double[7];

        System.out.println("original double array with default values : "+ Arrays.toString(doubleArray));

        // setting values to doubleArray using setAll() method
        Arrays.setAll(doubleArray, i -> i + 10.5);

        System.out.println("Double array.setAll(double) output: "+ Arrays.toString(doubleArray));
    }
}
