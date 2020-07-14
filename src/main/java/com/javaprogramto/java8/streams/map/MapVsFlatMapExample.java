package com.javaprogramto.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMapExample {

    public static void main(String[] args) {

        List<Stream> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)) // Stream of List<Integer>
                .map(List::stream)
                .collect(Collectors.toList());

        System.out.println("Output with map() -> "+together);


        List<Integer> togetherFlatMap = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)) // Stream of List<Integer>
                .flatMap(List::stream)
                .map(integer -> integer + 1)
                .collect(Collectors.toList());

        System.out.println("Output with flatMap() -> "+togetherFlatMap);
    }
}
