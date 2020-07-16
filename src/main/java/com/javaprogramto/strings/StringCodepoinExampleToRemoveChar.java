package com.javaprogramto.strings;

import java.util.stream.IntStream;

public class StringCodepoinExampleToRemoveChar {

    public static void main(String[] args) {

        String str = "Digit ZERO 0 is not considered in input name. So removing all Zero's 00000000";

        System.out.println("Input string value : " + str);

        IntStream intStream = str.codePoints();

        String zeroRemovedString = intStream.filter(ch -> ch != 48)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();


        System.out.println("Zero's are removed from input. Final output : "+zeroRemovedString);

    }
}
