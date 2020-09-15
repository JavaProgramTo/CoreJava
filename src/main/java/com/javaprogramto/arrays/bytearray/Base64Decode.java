package com.javaprogramto.arrays.bytearray;

import java.nio.charset.CharacterCodingException;
import java.util.Base64;

public class Base64Decode {

	public static void main(String[] args) throws CharacterCodingException {

		// creating string
		String inputStr = "javaprogrmto.com जावा";

		// java 8 string to byte[]
		byte[] array = Base64.getDecoder().decode(inputStr);

		// printing byte array
		for (int j = 0; j < array.length; j++) {
			System.out.print(" " + array[j]);
		}

	}
}
