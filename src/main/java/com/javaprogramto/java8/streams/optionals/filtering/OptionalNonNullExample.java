package com.javaprogramto.java8.streams.optionals.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalNonNullExample {

    public static void main(String[] args) {

        List<Optional<String>> optionalList = Arrays.asList(
                Optional.of("hello"),
                Optional.empty(),
                Optional.of("world"),
                Optional.empty(),
                Optional.of("welcome to JavaProgramTo.com blog"));

        List<String> nonEmptyValuesList = optionalList
                .stream()
                .filter(o -> o.isPresent())
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println(nonEmptyValuesList);

    }
}
