package com.javaprogramto.java11.shebang;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BatchJob {

    public static void main(String[] args) {

        System.out.println("Hello World");

        Stream<String> stream = Arrays.stream(args);

        int sum = stream.mapToInt(Integer::parseInt).sum();
        System.out.println("Total sum : "+sum);

        IntStream intStream =IntStream.range(1, 5);

        int output = intStream.sum();
        System.out.println("Sum of first 5 numbers - "+output);
    }
}
