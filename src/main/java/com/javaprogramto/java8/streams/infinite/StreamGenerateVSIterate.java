package com.javaprogramto.java8.streams.infinite;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGenerateVSIterate {

    public static void main(String[] args) {

        // Example to generate 10 random numbers from 0 to 20.
        Supplier<Integer> infiniteStream1 = () -> new Random().nextInt(20);

        List<Integer> randomNumbers = Stream.generate(infiniteStream1).limit(10).collect(Collectors.toList());

        System.out.println("10 random numbers list : " + randomNumbers);

        // Example to generate 10 random numbers from 0 to 20.
        Stream<Integer> infiniteStream2 = Stream.iterate(0, i -> i + 1);

        List<Integer> first10Numbers = infiniteStream2.limit(10).collect(Collectors.toList());

        System.out.println("first 10 numbers list : " + first10Numbers);

    }
}
