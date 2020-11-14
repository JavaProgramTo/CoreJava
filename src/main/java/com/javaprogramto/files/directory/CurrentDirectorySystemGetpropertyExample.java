package com.javaprogramto.files.directory;

public class CurrentDirectorySystemGetpropertyExample {

	public static void main(String[] args) {

		// Calling the getPropery() method with argument "user.dir"
		String currentDirectoryLocation = System.getProperty("user.dir");

		System.out.println("Current working directoruy : " + currentDirectoryLocation);

	}

}
