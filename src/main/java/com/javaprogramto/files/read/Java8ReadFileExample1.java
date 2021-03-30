package com.javaprogramto.files.read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Java 8 example to read the file using Streams.
 * 
 * @author javaprogramto.com
 *
 */

public class Java8ReadFileExample1 {

	public static void main(String[] args) {

		Path filePath = Path.of(
				"/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/java/com/javaprogramto/files/read/student.csv");

		Stream<String> stream = null;
		try {
			stream = Files.lines(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		stream.forEach(System.out::println);

	}

}
