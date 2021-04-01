package com.javaprogramto.files.readonlywrite;

import java.io.File;

/**
 * Example to convert the file from read only to writable form.
 * 
 * @author javaprogramto.com
 *
 */
public class FileSetWritableExample {

	public static void main(String[] args) {

		File newFile = new File("src/main/java/com/javaprogramto/files/readonlywrite/make-read-only.txt");

		// Changing the file from read only to writable format.
		boolean isWritableNow = newFile.setWritable(true);

		System.out.println("Can write the file ? : " + isWritableNow);
	}
}
