package com.javaprogramto.java8.streams.toarray;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrimitiveStreamToArray {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7);

        int[] array1 = integerStream.mapToInt(primitiveVlaue -> primitiveVlaue).toArray();

        System.out.println("int[] Array 1 : " + Arrays.toString(array1));

        Stream<Integer> integerStream2 = Stream.of(11, 22, 33, 44, 55);

        int[] array2 = integerStream2.mapToInt( i -> i).toArray();

        System.out.println("int[] Array 2 : " + Arrays.toString(array2));

    }
}


