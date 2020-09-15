package com.javaprogramto.arrays.bytearray;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CharsetDecode {

	public static void main(String[] args) {

		// creating byte array
		byte[] byteArray = { 106, 97, 118, 97, 112, 114, 111, 103, 114, 109, 116, 111, 46, 99, 111, 109, 32, 63, 63, 63,
				63 };
		// create charset object
		Charset charset = StandardCharsets.US_ASCII;

		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		// decoding string
		String output = charset.decode(byteBuffer).toString();

		System.out.println("output  : " + output);

	}
}
