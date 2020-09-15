package com.javaprogramto.arrays.bytearray;

import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

public class CharsetEncoderencode {

	public static void main(String[] args) throws CharacterCodingException {

		// creating string
		String inputStr = "javaprogrmto.com जावा";

		CharsetEncoder encoder = StandardCharsets.US_ASCII.newEncoder();

		// Replacing the unmapping charset with zero's
		encoder.onMalformedInput(CodingErrorAction.IGNORE).onUnmappableCharacter(CodingErrorAction.REPLACE)
				.replaceWith(new byte[] { 0 });

		byte[] array = encoder.encode(CharBuffer.wrap(inputStr)).array();

		// printing byte array
		for (int j = 0; j < array.length; j++) {
			System.out.print(" " + array[j]);
		}

	}
}
