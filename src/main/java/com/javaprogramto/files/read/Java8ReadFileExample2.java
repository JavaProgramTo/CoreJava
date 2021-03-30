package com.javaprogramto.files.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 8 example to read the file using Streams + BufferedReader.lines().
 * 
 * @author javaprogramto.com
 *
 */

public class Java8ReadFileExample2 {

	public static void main(String[] args) throws IOException {

		Path filePath = Path.of(
				"/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/java/com/javaprogramto/files/read/student.csv");

		BufferedReader br = Files.newBufferedReader(filePath);

		List<String> list = br.lines().collect(Collectors.toList());

		list.forEach(System.out::println);

	}

}
