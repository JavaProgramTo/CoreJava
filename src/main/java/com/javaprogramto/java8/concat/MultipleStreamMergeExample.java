package com.javaprogramto.java8.concat;

import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

public class MultipleStreamMergeExample {

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

        Stream<Integer> final5StreamsMergeREsult = Stream.concat(stream1,
                concat(stream2, concat(stream3, concat(stream4, stream5))));

        // printing sorted merged stream values
        System.out.println("5 Streams merge result : ");
        final5StreamsMergeREsult.forEach(merge -> System.out.println(merge));

    }

}