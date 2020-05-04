package com.javaprogramto.w3schools.programs.ascii;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringToAsciiUSBytes {

    public static void main(String[] args) {

        String input = "ascii US bytes";

        // converting string to bytes array.
        byte[] bytesArray = input.getBytes(StandardCharsets.US_ASCII);

        // bytes array to sscii string.
        String asciiStr = Arrays.toString(bytesArray);

        System.out.println("String to ASCII with US_ASCII : "+asciiStr);
    }
}
