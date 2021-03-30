package com.javaprogramto.files.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Example to read the file in java
 * 
 * @author javaprogramto.com
 *
 */
public class ReadFileBeforeJava8 {

	public static void main(String[] args) throws IOException {
		String fileLocation = "/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/java/com/javaprogramto/files/read/student.txt";

		FileReader fileReader = new FileReader(fileLocation);

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		int index = 1;

		while ((line = bufferedReader.readLine()) != null) {
			System.out.println("line " + index + " : " + line);
			index++;
		}
	}
}
