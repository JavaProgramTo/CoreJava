package com.javaprogramto.java8.streams.infinite;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateExample {

    public static void main(String[] args) {

        // Creating a infinite Stream
        Stream<Integer> even10Numbers = Stream.iterate(0, i -> i +2);

        List<Integer> first10Numbers = even10Numbers.limit(10).collect(Collectors.toList());

        System.out.println("even10Numbers with limit 10 : "+first10Numbers);

    }
}
