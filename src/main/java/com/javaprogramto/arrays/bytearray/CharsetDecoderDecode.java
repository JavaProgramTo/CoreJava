package com.javaprogramto.arrays.bytearray;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

public class CharsetDecoderDecode {

	public static void main(String[] args) throws CharacterCodingException {

		// creating byte array
		byte[] byteArray = { 106, 97, 118, 97, 112, 114, 111, 103, 114, 109, 116, 111, 46, 99, 111, 109, 32, 63, 63, 63,
				63 };

		CharsetDecoder decoder = StandardCharsets.US_ASCII.newDecoder();

		// Replacing the unmapping charset with zero's
		decoder.onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE)
				.replaceWith("2");
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

		String finalDecodedStr = decoder.decode(byteBuffer).toString();

		System.out.println("finalDecodedStr : " + finalDecodedStr);
	}
}
