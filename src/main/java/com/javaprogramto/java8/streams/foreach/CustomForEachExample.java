package com.javaprogramto.java8.streams.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomForEachExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "seven", "nine", "ten");

        List<String> output = new ArrayList<>();
        CustomForEachImpl.forEach(list.stream(), (str, breaker) -> {

            if (str.length() > 3) {
                breaker.stop();
            } else {
                output.add(str);
            }

        });

        System.out.println("custom foreach output: "+output);

    }
}
