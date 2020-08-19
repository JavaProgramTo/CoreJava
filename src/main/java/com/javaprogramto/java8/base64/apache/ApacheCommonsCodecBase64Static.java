package com.javaprogramto.java8.base64.apache;

import org.apache.commons.codec.binary.Base64;

public class ApacheCommonsCodecBase64Static {
    public static void main(String[] args) {

        String originalInput = "Test commons codec with static methods";

        // Commons codec encoding with Base64.encodeBase64()
        String encodedString = new String(Base64.encodeBase64(originalInput.getBytes()));
        System.out.println("Encoded string : "+encodedString);

        // Commons codec decoding with Base64.decodeBase64()
        String decodedString = new String(Base64.decodeBase64(encodedString.getBytes()));
        System.out.println("Decoded string : "+decodedString);

    }
}
