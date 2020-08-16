package com.javaprogramto.java8.skip;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Skip5EvenNumbersExample {
    public static void main(String[] args) {

        Stream<Integer> evenNumbers = Stream.of(2, 4, 5, 8, 10, 12, 14, 16, 18, 20);

        List<Integer> next20Numbers = evenNumbers
                .skip(5)
                .collect(Collectors.toList());

        System.out.println("skipping first 5 even Numbers");
        next20Numbers.forEach(number -> System.out.println(number));
    }
}
