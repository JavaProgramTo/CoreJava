package com.javaprogramto.java8.anymatch;

import java.util.stream.Stream;

public class AnyMatchEvenExample {

    public static void main(String[] args) {

        Integer[] numbers = {1, 3, 5, 7, 8, 9};

        Stream<Integer> intStream = Stream.of(numbers);

        boolean matchFound = intStream.anyMatch(number -> number % 2 == 0);

        if(matchFound){
            System.out.println("int array has even number");
        } else {
            System.out.println("int array has no even number");
        }
    }
}
