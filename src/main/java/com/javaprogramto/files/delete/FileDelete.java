package com.javaprogramto.files.delete;

import java.io.File;

/**
 * How to delete the file in java using File api delete() method.
 * 
 * @author JavaProgramTo.com
 *
 */
public class FileDelete {

	public static void main(String[] args) {

		// File deletion success
		String fileName = "src/main/java/com/javaprogramto/files/delete/test.log";
		
		File file = new File(fileName);
		
		boolean isFileDeleted = file.delete();
		
		if(isFileDeleted) {
			System.out.println("File deleted without any errors for "+fileName);
		} else {
			System.out.println("File deletion is failed");
		}
		
		// File deletion error.
		
		fileName = "src/main/java/com/javaprogramto/files/delete/no-file.log";
		
		file = new File(fileName);
		
		isFileDeleted = file.delete();
		
		if(isFileDeleted) {
			System.out.println("File deleted without any errors for "+fileName);
		} else {
			System.out.println("File deletion is failed for "+fileName);
		}


	}

}
