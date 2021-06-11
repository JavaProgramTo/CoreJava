package com.javaprogramto.convert.list2string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example to convert List to string using Collectors.joining() method.
 * 
 * @author javaprogramto.com
 *
 */
public class ListToStringUsingCollectors_JoinExample {

	public static void main(String[] args) {
		
		// creating a list with strings.
		List<String> list = Arrays.asList("One",
						  "Two",
						  "Three",
						  "Four",
						  "Five");

		// using java 8 Collectors.joining with delimiter, prefix and suffix
		String joiningString = list.stream().collect(Collectors.joining("-", "{", "}"));
		
		// printing
		System.out.println("Collectors.joining string : "+joiningString);
		
		String joiningString3 = list.stream().collect(Collectors.joining("@", "", ""));
		
		// printing
		System.out.println("Collectors.joining string with @ separator : "+joiningString3);
		
		
	}
}
