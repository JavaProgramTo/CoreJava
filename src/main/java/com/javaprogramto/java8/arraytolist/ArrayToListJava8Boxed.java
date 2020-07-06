package com.javaprogramto.java8.arraytolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToListJava8Boxed {
    public static void main(String[] args) {

// Example using stream.boxed()

        int[] intArray = {1, 2, 3, 4, 5, 6, 6};
        System.out.println("Array : " + Arrays.toString(intArray));

        List<Integer> list = convertPrimitiveArrayToList(intArray);

        System.out.println("Converted ArrayList : " + list);

    }

    private static List<Integer> convertPrimitiveArrayToList(int[] array) {

// convert int array to Integer stream with boxed() method
        Stream<Integer> stream = Arrays.stream(array).boxed();

// collecting converted stream into list
        List<Integer> outputList = stream.collect(Collectors.toList());

        return outputList;
    }

}