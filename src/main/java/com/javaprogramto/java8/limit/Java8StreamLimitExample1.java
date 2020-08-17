package com.javaprogramto.java8.limit;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamLimitExample1 {

    public static void main(String[] args) {

        // creating list
        List<Integer> numbers = new ArrayList<>();

        // adding values to list
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(60);
        numbers.add(20);
        numbers.add(-1000);
        numbers.add(-87);
        numbers.add(4);
        numbers.add(343);
        numbers.add(23);
        numbers.add(343);
        numbers.add(1454);
        numbers.add(1464);
        numbers.add(10);

        // Converting list to stream
        Stream<Integer> stream = numbers.stream();

        // Taking only first 10 values from stream and converting them into list
        List<Integer> limit10 = stream.limit(10).collect(Collectors.toList());

        // printing the limit output
        System.out.println("Limit output with 10 values: ");
        limit10.forEach(value -> System.out.println(value));

    }

}