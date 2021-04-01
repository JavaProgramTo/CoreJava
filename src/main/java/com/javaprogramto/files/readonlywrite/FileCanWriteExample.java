package com.javaprogramto.files.readonlywrite;

import java.io.File;

/**
 * Example to check the file is writable or not.
 * 
 * @author javaprogramto.com
 *
 */
public class FileCanWriteExample {

	public static void main(String[] args) {

		File newFile = new File("src/main/java/com/javaprogramto/files/readonlywrite/make-read-only.txt");

		// checking the is allowed for modifications.
		boolean isSetToReadOnly = newFile.canWrite();

		System.out.println("Can write the file ? : " + isSetToReadOnly);

		File breandNewFile = new File("src/main/java/com/javaprogramto/files/readonlywrite/make-new-file.txt");

		// checking the is allowed for modifications.
		isSetToReadOnly = breandNewFile.canWrite();

		System.out.println("Can write the breandNewFile file ? : " + isSetToReadOnly);
	}
}
