package com.javaprogramto.arrays.setall;

import java.util.Arrays;

public class StringArraySetAllExample {

    public static void main(String[] args) {

        // Creating a String array with default values
        String[] stringArray = new String[7];

        System.out.println("original long array with default values : "+ Arrays.toString(stringArray));

        // setting values to stringArray using setAll() method
        Arrays.setAll(stringArray, i -> "Index " + i);

        System.out.println("String array.setAll(String) output: "+ Arrays.toString(stringArray));
    }
}
