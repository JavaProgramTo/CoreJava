package com.javaprogramto.java8.arraytolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToListJava8Stream {
    public static void main(String[] args) {

// Example using Collections.addAll(outputList, array);

        String[] intArray = {"java", "program", "to", "convert", "array to list"};
        System.out.println("Array : " + Arrays.toString(intArray));

        List<String> list = convertArrayToList(intArray);

        System.out.println("Converted ArrayList : " + list);

    }

    private static <T> List<T> convertArrayToList(T[] array) {

// convert array to stream
        Stream<T> stream = Arrays.stream(array);

// collecting converted stream into list
        List<T> outputList = stream.collect(Collectors.toList());

        return outputList;
    }

}
