package com.javaprogramto.files.tostring;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java example to convert File To String.
 * 
 * @author javaprogramto.com
 *
 */
public class JavaFilesToString {

	public static void main(String[] args) throws IOException {

		// file location
		String filePath = "/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/resources/dummy.txt";

		// charset for encoding
		Charset encoding = Charset.defaultCharset();

		// reading all lines of file as List of strings
		List<String> lines = Files.readAllLines(Paths.get(filePath), encoding);
		
		// converting List<String> to palin string using java 8 api.
		String string = lines.stream().collect(Collectors.joining("\n"));
		
		// printing the final string.
		System.out.println("file as string ");
		System.out.println(string);

	}

}
