package com.javaprogramto.java8.streams.optionals.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalNonNullFlatMapEample {

    public static void main(String[] args) {

        List<Optional<String>> optionalList = Arrays.asList(
                Optional.of("hello"),
                Optional.empty(),
                Optional.of("world"),
                Optional.empty(),
                Optional.of("welcome to"),
                Optional.of("JavaProgramTo.com"));

        System.out.println("optionalList values : "+optionalList);

        List<String> nonEmptyValuesList = optionalList
                .stream()
                .flatMap(optional -> optional.isPresent() ? Stream.of(optional.get()) : Stream.empty())
                .collect(Collectors.toList());

        System.out.println(nonEmptyValuesList);

    }
}
