package com.javaprogramto.files.directory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentDirectoryPathGetExample {

	public static void main(String[] args) {

		// Current location from path.
		Path currentPath = Paths.get("");
		
		// getting the location from Path.toAbsolutePath()
		String currentLocation = currentPath.toAbsolutePath().toString();
		
		
		System.out.println("Current working directoruy : " + currentLocation);

	}

}
