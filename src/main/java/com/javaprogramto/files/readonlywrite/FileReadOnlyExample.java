package com.javaprogramto.files.readonlywrite;

import java.io.File;

/**
 * Example to set the file as read-only format.
 * 
 * @author javaprogramto.com
 *
 */
public class FileReadOnlyExample {

	public static void main(String[] args) {

		File newFile = new File("src/main/java/com/javaprogramto/files/readonlywrite/make-read-only.txt");
		
		// setting the file as read only
		boolean isSetToReadOnly = newFile.setReadOnly();
		
		System.out.println("isSetToReadOnly value : "+isSetToReadOnly);
		
		if(isSetToReadOnly) {
			System.out.println("make-read-only.txt is set to read-only form");
		}else {
			System.out.println("Failed to set file as read only for make-read-only.txt");
		}
		
	}
}
