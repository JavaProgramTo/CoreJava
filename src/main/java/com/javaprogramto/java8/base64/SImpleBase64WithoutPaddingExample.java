package com.javaprogramto.java8.base64;

import java.util.Base64;

public class SImpleBase64WithoutPaddingExample {

    public static void main(String[] args) {

        String originalString = "Welcome to javaprogramto.com";

        System.out.println("Original String : "+originalString);
        // create base simple encoder object
        Base64.Encoder simpleEncoder = Base64.getEncoder();

        // Encoding string using simple encode
        String encodedString = simpleEncoder.encodeToString(originalString.getBytes());
        System.out.println("Encoded string with padding : "+encodedString);

        // encode  without  padding
        Base64.Encoder withoutPaddingEncoder = Base64.getEncoder().withoutPadding();
        String encodeWithoutPadding  =  withoutPaddingEncoder.encodeToString(originalString.getBytes());
        System.out.println("Encoded string without padding : "+encodeWithoutPadding);

        // Create base simple decoder  object
        Base64.Decoder simpleDecoder = Base64.getDecoder();

        // Deconding the encoded string using decoder
        String decodedString = new String(simpleDecoder.decode(encodeWithoutPadding.getBytes()));
        System.out.println("Decoded String : "+decodedString);
    }
}
