package com.javaprogramto.java8.concat;

import java.util.stream.Stream;

public class StreamConcatSortExample {

    public static void main(String[] args) {

        // Creating odd numbers stream
        Stream<Integer> oddStream = Stream.of(1, 3, 5, 7, 9);

        // Creating even numbers stream
        Stream<Integer> evenStream = Stream.of(2, 4, 6, 8);

        // Merging two streams in java 8 using concat() method
        Stream<Integer> sortedStream = Stream.concat(oddStream, evenStream).sorted();

        // printing sorted merged stream values
        System.out.println("Sorted resulting stream values are ");
        sortedStream.forEach(even -> System.out.println(even));
    }

}