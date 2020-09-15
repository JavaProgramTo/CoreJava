package com.javaprogramto.arrays.bytearray;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharsetEncode {

	public static void main(String[] args) {

		// creating string
		String inputStr = "javaprogrmto.com जावा";

		// create charset object
		Charset charset = StandardCharsets.US_ASCII;

		// encoding string
		ByteBuffer buffer = charset.encode(inputStr);

		// ByteBuffer to byte[] array
		byte[] array = buffer.array();

		// printing byte array
		for (int j = 0; j < array.length; j++) {
			System.out.print(" " + array[j]);
		}

	}
}
