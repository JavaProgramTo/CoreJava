package com.javaprogramto.arrays.find;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntDoubleStream {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean foundInt = IntStream.of(values).anyMatch(value -> value == 6);

        if (foundInt) {
            System.out.println("value 8 check using IntStream anyMatch method.");
        } else {
            System.out.println("value 8 not found using IntStream");
        }


        double[] decimals = {1.1, 2.2, 3.3, 4.4, 5.5};

        boolean foundDouble = DoubleStream.of(decimals).anyMatch(value -> value == 5.5);

        if (foundDouble) {
            System.out.println("value 5.5 check using DoubleStream anyMatch method.");
        } else {
            System.out.println("value 5.5 not found using DoubleStream");
        }


    }
}
