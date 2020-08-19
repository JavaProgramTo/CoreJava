package com.javaprogramto.java8.base64;

import java.util.Base64;

public class SImpleBase64URLExample {

    public static void main(String[] args) {

        String originalStringURL = "https://www.google.co.in/imghp?hl=en&tab=wi&authuser=0&ogbl";

        System.out.println("Original String : "+originalStringURL);

        // create url encoder object
        Base64.Encoder simpleEncoder = Base64.getUrlEncoder();

        // Encoding string using url encode
        String encodedString = simpleEncoder.encodeToString(originalStringURL.getBytes());
        System.out.println("Encoded URL string with padding : "+encodedString);

        // encode  without  padding
        Base64.Encoder withoutPaddingEncoder = Base64.getEncoder().withoutPadding();
        String encodeWithoutPadding  =  withoutPaddingEncoder.encodeToString(originalStringURL.getBytes());
        System.out.println("Encoded URL string without padding : "+encodeWithoutPadding);

        // Create base simple decoder  object
        Base64.Decoder simpleDecoder = Base64.getDecoder();

        // Deconding the encoded string using decoder
        String decodedString = new String(simpleDecoder.decode(encodeWithoutPadding.getBytes()));
        System.out.println("Decoded URL String : "+decodedString);
    }
}
