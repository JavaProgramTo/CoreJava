package com.javaprogramto.java8.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class StreamFilterBreak {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three", "seven", "nine", "ten");

        list.stream().filter(s -> s.length() <= 3).forEach(value -> System.out.println(value));
    }
}
