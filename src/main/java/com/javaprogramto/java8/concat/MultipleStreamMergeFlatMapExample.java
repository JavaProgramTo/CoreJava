package com.javaprogramto.java8.concat;


import java.util.stream.Stream;

public class MultipleStreamMergeFlatMapExample {

    public static void main(String[] args) {

        // Creating stream 1
        Stream<Integer> stream1 = Stream.of(1, 2, 3);

        // Creating stream 2
        Stream<Integer> stream2 = Stream.of(4, 5, 6);

        // Creating stream 3
        Stream<Integer> stream3 = Stream.of(7, 8, 9);

        // Creating stream 4
        Stream<Integer> stream4 = Stream.of(10, 11, 12);

        // Creating stream 5
        Stream<Integer> stream5 = Stream.of(13, 14, 15);

        // Creating a new string from all 5 streams using Stream.of() method.
        Stream<Stream<Integer>> finalStream = Stream.of(stream1, stream2, stream3, stream4, stream5);

        Stream<Integer> mergedStream = finalStream.flatMap(stream -> stream.map( v -> v));

        // printing sorted merged stream values
        System.out.println("merge with flatmap : ");
        mergedStream.forEach(merge -> System.out.println(merge));

    }

}