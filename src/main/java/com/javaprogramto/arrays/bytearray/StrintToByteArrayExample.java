package com.javaprogramto.arrays.bytearray;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StrintToByteArrayExample {

	public static void main(String[] args) {

		// creating string
		String string = "javaprogrmto.com";

		// string to byte array
		byte[] array1 = string.getBytes();

		// printing byte array
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i]);
		}

		System.out.println();
		String characterSetName = "ASCII";

		try {
			byte[] array2 = string.getBytes(characterSetName);

			// printing byte array
			for (int i = 0; i < array2.length; i++) {
				System.out.print(" " + array1[i]);
			}

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

		String str2 = "Welcome, JavaProgramto.com !!!!";
		Charset charset = StandardCharsets.UTF_16;
		byte[] array3 = str2.getBytes(charset);
		// printing byte array
		for (int j = 0; j < array3.length; j++) {
			System.out.print(" " + array3[j]);
		}

	}
}
