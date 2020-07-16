package com.javaprogramto.strings;

import java.util.stream.IntStream;

public class StringCodepoinExampleToConvertStream {

    public static void main(String[] args) {

        String str = "Code Points as Stream";

        System.out.println("Input string value : "+str);

        IntStream intStream = str.codePoints();

        System.out.println("Printing each char from string as ASCII value");
        intStream.forEach(value -> System.out.print(value+" "));

    }
}
