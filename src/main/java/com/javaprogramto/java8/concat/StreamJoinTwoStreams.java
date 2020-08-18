package com.javaprogramto.java8.concat;

import java.util.stream.Stream;

public class StreamJoinTwoStreams {

    public static void main(String[] args) {

        // Creating stream 1
        Stream<Integer> stream1 = Stream.of(2, 4, 6, 8, 10);

        // Creating stream 2
        Stream<Integer> stream2 = Stream.of(1, 3, 5, 7, 9);

        // Merging two streams in java 8 using concat method
        Stream<Integer> mergedStream = Stream.concat(stream1, stream2);

        // printing merged stream values
        System.out.println("Merged stream values are ");
        mergedStream.forEach(even -> System.out.println(even));
    }

}
