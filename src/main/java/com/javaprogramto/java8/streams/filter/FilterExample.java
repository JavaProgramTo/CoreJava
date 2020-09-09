package com.javaprogramto.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {

        List<Integer> numbers  =  Arrays.asList(10,50,30,18,35);

        List<Integer> evenNumbers  =  numbers.stream().filter(number ->  number % 2 ==  0).collect(Collectors.toList());

        System.out.println("After applying the filter function : "+evenNumbers);


    }
}
