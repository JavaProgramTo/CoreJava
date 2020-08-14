package com.javaprogramto.java8.streams.toarray;

import java.util.Arrays;
import java.util.stream.Stream;

public class MethodRefStreamToArray {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("hello", "reader", "welcome", "to", "javaprogramto.com", "blog");

        String[] array1 = convertStreamToArray(stringStream);

        System.out.println("Array 1 : "+ Arrays.toString(array1));

        Stream<String> stringStream2 = Stream.of("seocond", "example", "stream to array");

        String[] array2 = convertStreamToArray(stringStream2);

        System.out.println("Array 2 : "+ Arrays.toString(array2));

    }

    public static String[] convertStreamToArray(Stream<String> stringStream) {

        String[] strArray = stringStream.toArray(String[]::new);

        return strArray;
    }
}


