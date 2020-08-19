package com.javaprogramto.java8.base64.apache;

import org.apache.commons.codec.binary.Base64;

public class ApacheCommonsCodecBase64 {
    public static void main(String[] args) {

        String originalInput = "test input for apache commons codec";

        Base64 base64 = new Base64();

        // Commons codec encoding
        String encodedString = new String(base64.encode(originalInput.getBytes()));
        System.out.println("Encoded string : "+encodedString);

        // Commons codec decoding
        String decodedString = new String(base64.decode(encodedString.getBytes()));
        System.out.println("Decoded string : "+decodedString);

    }
}
