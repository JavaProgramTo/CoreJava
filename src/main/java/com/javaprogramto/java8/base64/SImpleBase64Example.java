package com.javaprogramto.java8.base64;

import java.util.Base64;

public class SImpleBase64Example {

    public static void main(String[] args) {

        String originalString = "Welcome to javaprogramto.com";

        // create base simple encoder object
        Base64.Encoder simpleEncoder = Base64.getEncoder();

        // Encoding string using simple encode
        String encodedString = simpleEncoder.encodeToString(originalString.getBytes());

        Base64.Encoder withoutPaddingEncoder = Base64.getEncoder().withoutPadding();
        System.out.println("Encoded string : "+encodedString);

        // Create base simple decoder  object
        Base64.Decoder simpleDecoder = Base64.getDecoder();

        // Deconding the encoded string using decoder
        String decodedString = new String(simpleDecoder.decode(encodedString.getBytes()));
        System.out.println("Decoded String : "+decodedString);
    }
}
