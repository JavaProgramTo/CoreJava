package com.javaprogramto.java8.streams.toarray;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class CustomIntFunctionStreamToArray {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("hello", "reader", "welcome", "to", "javaprogramto.com", "blog");

        String[] array1 = stringStream.toArray(new CustomIntFunction());

        System.out.println("Array 1 : "+ Arrays.toString(array1));

        Stream<String> stringStream2 = Stream.of("seocond", "example", "stream to array");

        String[] array2 = stringStream2.toArray(new CustomIntFunction());;

        System.out.println("Array 2 : "+ Arrays.toString(array2));

    }

}

class CustomIntFunction implements IntFunction<String[]>{

    @Override
    public String[] apply(int size) {
        return new String[size];
    }
}


