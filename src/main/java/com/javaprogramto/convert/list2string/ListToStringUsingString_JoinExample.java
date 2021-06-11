package com.javaprogramto.convert.list2string;

import java.util.Arrays;
import java.util.List;

/**
 * Example to convert List to string using Collectors.join() method.
 * 
 * @author javaprogramto.com
 *
 */
public class ListToStringUsingString_JoinExample {

	public static void main(String[] args) {
		
	// creating a list with strings.
	List<String> list = Arrays.asList("One",
					  "Two",
					  "Three",
					  "Four",
					  "Five");
	
	// converting List<String> to String using toString() method
	String stringFromList = String.join("~", list);
	
	// priting the string
	System.out.println("String with tilde delimiter: "+stringFromList);
	
	// delimiting with pipe | symbol.
	String stringPipe = String.join("|", list);
	
	// printing
	System.out.println("String with pipe delimiter : "+stringPipe);
	
	}
}
