package com.javaprogramto.convert.list2string;

import java.util.Arrays;
import java.util.List;

/**
 * Example to convert List to string using toString() method.
 * 
 * @author javaprogramto.com
 *
 */
public class ListToStringUsingToStringExample {

	public static void main(String[] args) {
		
	// creating a list with strings.
	List<String> list = Arrays.asList("One",
					  "Two",
					  "Three",
					  "Four",
					  "Five");
	
	// converting List<String> to String using toString() method
	String stringFromList = list.toString();
	
	// priting the string
	System.out.println("String : "+stringFromList);		
	}
}
