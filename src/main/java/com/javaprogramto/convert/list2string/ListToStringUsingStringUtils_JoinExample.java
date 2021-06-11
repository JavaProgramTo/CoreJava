package com.javaprogramto.convert.list2string;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * Example to convert List to string using apache commons stringutils.join() method.
 * 
 * @author javaprogramto.com
 *
 */
public class ListToStringUsingStringUtils_JoinExample {

	public static void main(String[] args) {
		
	// creating a list with strings.
	List<String> list = Arrays.asList("One",
					  "Two",
					  "Three",
					  "Four",
					  "Five");

	// using java 8 Collectors.joining with delimiter, prefix and suffix
	String joiningString = StringUtils.join(list, "^");
	
	// printing
	System.out.println("StringUtils.join string with ^ delimiter : "+joiningString);
	
	String joiningString3 = StringUtils.join(list, "$");
	
	// printing
	System.out.println("StringUtils.join string with @ separator : "+joiningString3);
	
	
	}
}
