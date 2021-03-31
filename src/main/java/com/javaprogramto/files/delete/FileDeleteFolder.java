package com.javaprogramto.files.delete;

import java.io.File;

/**
 * How to delete the folder in java using File API delete() method.
 * 
 * @author JavaProgramTo.com
 *
 */
public class FileDeleteFolder {

	public static void main(String[] args) {

		// Folder deletion not done
		String folderName = "src/main/java/com/javaprogramto/files/delete";
		
		File file = new File(folderName);
		
		boolean isFileDeleted = file.delete();
		
		if(isFileDeleted) {
			System.out.println("Folder with files is deleted");
		} else {
			System.out.println("Folder with files is not deleted");
		}
		
		// Empty Folder deletion success .
		
		folderName = "src/main/java/com/javaprogramto/files/emptyfolder";
		
		file = new File(folderName);
		
		isFileDeleted = file.delete();
		
		if(isFileDeleted) {
			System.out.println("Empty Folder deleted ");
		} else {
			System.out.println("Empty Folder deletion is failed for "+folderName);
		}
	}
}
