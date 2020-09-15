package com.javaprogramto.arrays.bytearray;

import java.nio.charset.CharacterCodingException;
import java.util.Base64;

public class Base64Encode {

	public static void main(String[] args) throws CharacterCodingException {

		// creating byte array
		byte[] byteArray = { 76, 77, 65 };

		// Create base simple decoder object
		Base64.Decoder simpleDecoder = Base64.getDecoder();

		// Deconding the encoded string using decoder
		String decodedString = new String(simpleDecoder.decode(byteArray));
		System.out.println("Decoded String : " + decodedString);

	}
}
