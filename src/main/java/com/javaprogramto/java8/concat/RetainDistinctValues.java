package com.javaprogramto.java8.concat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RetainDistinctValues {

    public static void main(String[] args) {

        // Creating stream 1
        Stream<Integer> stream1 = Stream.of(1, 2, 3);

        // Creating stream 2
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6);

        // Removing duplicate elemetns
        List<Integer> uniqueValues = Stream.concat(stream1, stream2).distinct().collect(Collectors.toList());

        // printing sorted merged stream values
        System.out.println("Removed duplicates after merge");
        uniqueValues.forEach(merge -> System.out.println(merge));


    }

}