package com.javaprogramto.java8.streams.toarray;

import java.util.Arrays;
import java.util.stream.Stream;

public class LambdaStreamToArray {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("hello", "reader", "welcome", "to", "javaprogramto.com", "blog");

        String[] array1 = convertStreamToArrayWithLambda(stringStream);

        System.out.println("Array 1 : "+ Arrays.toString(array1));

        Stream<String> stringStream2 = Stream.of("seocond", "example", "stream to array");

        String[] array2 = convertStreamToArrayWithLambda(stringStream2);

        System.out.println("Array 2 : "+ Arrays.toString(array2));

    }

    public static String[] convertStreamToArrayWithLambda(Stream<String> stringStream) {

        String[] strArray = stringStream.toArray(size -> {
            return new String[size];
        });

        return strArray;
    }
}


