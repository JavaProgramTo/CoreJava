package com.javaprogramto.java8.skip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Skip10ValuesExample {
    public static void main(String[] args) {

        Stream<Integer> numnerSeries = Stream.iterate(1, i -> i+ 1);

        List<Integer> next20Numbers = numnerSeries.skip(10).limit(20).collect(Collectors.toList());

        System.out.println("20 Numbers after skipping first 10 numbers");
        next20Numbers.forEach(number -> System.out.println(number));
    }
}
