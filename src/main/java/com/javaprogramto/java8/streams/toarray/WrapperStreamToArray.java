package com.javaprogramto.java8.streams.toarray;

import java.util.Arrays;
import java.util.stream.Stream;

public class WrapperStreamToArray {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7);

        Integer[] array1 = integerStream.toArray(Integer[]::new);

        System.out.println("Integer Array 1 : " + Arrays.toString(array1));

        Stream<Integer> integerStream2 = Stream.of(11, 22, 33, 44, 55);

        Integer[] array2 = integerStream2.toArray(size -> new Integer[size]);

        System.out.println("Integer Array 2 : " + Arrays.toString(array2));

    }
}


