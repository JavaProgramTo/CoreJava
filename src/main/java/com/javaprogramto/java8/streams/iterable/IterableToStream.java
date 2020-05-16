package com.javaprogramto.java8.streams.iterable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterableToStream {

    public static void main(String[] args) {

        Iterable<String> iterable = Arrays.asList("Iterable", "to", "Stream", "in", "Java 8");

        Stream<String> stream = StreamSupport.stream(iterable.spliterator(), false);

        List<String> list = stream.map(string -> string.toLowerCase()).collect(Collectors.toList());

        list.forEach( value -> System.out.println(value));

    }
}
