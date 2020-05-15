package com.javaprogramto.java8.streams.parallel.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class ParallelStreamCreation {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);

        Stream<Integer> parallelStream = intList.parallelStream();

        ForkJoinPool.commonPool();

        parallelStream.forEach(value -> System.out.println(value));
    }
}
