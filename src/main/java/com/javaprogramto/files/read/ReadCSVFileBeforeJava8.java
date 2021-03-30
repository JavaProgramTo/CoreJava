package com.javaprogramto.files.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Example to read the CSV file in java
 * 
 * @author javaprogramto.com
 *
 */
public class ReadCSVFileBeforeJava8 {

	public static void main(String[] args) throws IOException {
		String fileLocation = "/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/java/com/javaprogramto/files/read/student.csv";

		FileReader fileReader = new FileReader(fileLocation);

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String csvLine;
		int index = 1;
		String header = bufferedReader.readLine();
				
		System.out.println("CSV header : "+header);
		while ((csvLine = bufferedReader.readLine()) != null) {
			System.out.println("csv line " + index + " : " + csvLine);
			index++;
		}
	}
}
