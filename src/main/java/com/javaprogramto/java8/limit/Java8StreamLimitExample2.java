package com.javaprogramto.java8.limit;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamLimitExample2 {

    public static void main(String[] args) {

        // Creating a Stream with 2 powers.
        Stream<Integer> infiniteNumbers = Stream.iterate(2, i -> i * 2);

        // Limiting 2 powers to first 5 values and converting it to Set.
        Set<Integer> limit10 = infiniteNumbers.limit(5).collect(Collectors.toSet());

        // printing the set values.
        System.out.println("Limit output with 5 : ");
        limit10.forEach(value -> System.out.println(value));

    }

}
