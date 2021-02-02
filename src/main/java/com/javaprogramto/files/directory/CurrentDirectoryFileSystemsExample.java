package com.javaprogramto.files.directory;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class CurrentDirectoryFileSystemsExample {

	public static void main(String[] args) {

		// Current location from FileSystems.
		Path currentPath = FileSystems.getDefault().getPath(".");
		
		// getting the location from Path.toAbsolutePath()
		String currentLocation = currentPath.toAbsolutePath().normalize().toString();
		
		
		System.out.println("Current working directoruy : " + currentLocation);

	}

}
