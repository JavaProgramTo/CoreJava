package com.javaprogramto.arrays.bytearray;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringConstructorDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String charset = "IBM01140";
		byte[] byteArray = { 106, 97, 118, 97, 112, 114, 111, 103, 114, 109, 116, 111, 46, 99, 111, 109 };

		String decode = new String(byteArray, charset);

		System.out.println("Decoded string : " + decode);

		Charset charset_utf8 = StandardCharsets.UTF_8;

		byte[] byteArray1 = { 106, 97, 118, 97, 112, 114, 111, 103, 114, 109, 116, 111, 46, 99, 111, 109 };

		String decodedStrUTF8 = new String(byteArray1, charset_utf8);

		System.out.println("Decoded string using UTF 8 : " + decodedStrUTF8);

	}
}
