package com.javaprogramto.java8.concat;


import java.util.stream.Stream;

public class StreamConcatException {

    public static void main(String[] args) {

        // Creating stream 1
        Stream<Integer> stream1 = Stream.of(1, 1, 1);

        // Creating stream 2
        Stream<Integer> stream2 = Stream.of(2, 2, 2);

        // Merging two streams in java 8 using concat() method
        Stream<Integer> resultStream = Stream.concat(stream1, stream2);

        // printing stream1 values
        System.out.println("Stream 1 values are ");
        stream1.forEach(even -> System.out.println(even));
    }

}