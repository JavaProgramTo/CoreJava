package com.javaprogramto.arrays.find;

import java.util.Arrays;

public class Java8AnyMatch {

    public static void main(String[] args) {

        Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean foundInt = Arrays.stream(values).anyMatch(value -> value == 6);

        if (foundInt) {
            System.out.println("6 is present in the values array using java 8 stream api using anyMatch() method");
        } else {
            System.out.println("6 is not present in the values array using java 8 stream api using anyMatch() method");
        }

        String[] fruites = {"banana", "jack fruit", "orange", "mango", "apple"};

        boolean foundFruit = Arrays.stream(fruites).anyMatch(fruitName -> "apple".equalsIgnoreCase(fruitName));

        if (foundFruit) {
            System.out.println("apple is present in the fruitesList array using java 8 stream api using anyMatch() method");
        } else {
            System.out.println("apple is not present in the fruitesList array using java 8 stream api using anyMatch() method");
        }
    }
}
