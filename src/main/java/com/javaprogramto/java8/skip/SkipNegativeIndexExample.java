package com.javaprogramto.java8.skip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipNegativeIndexExample {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3);

        List<Integer> expectingError = numbers
                .skip(-25)
                .collect(Collectors.toList());

        System.out.println("skipping first 5 even Numbers");
        expectingError.forEach(number -> System.out.println(number));
    }
}
