package com.javaprogramto.java8.streams.distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStringExample {

	public static void main(String[] args) {
		// create a list with string values
		List<String> strings = new ArrayList<>();
		
		// adding values to list 
		strings.add("ABC");
		strings.add("XYZ");
		strings.add("ABC");
		strings.add("MNO");
		strings.add("ABC");
		strings.add("MNO");
		strings.add("PQR");
		
		// Getting the distinct values from stream using distinct() method
		List<String> uniqueStrings = strings.stream().distinct().collect(Collectors.toList());
		
		//printing the values
		System.out.println("Original list : "+strings);
		System.out.println("Unique values list : "+uniqueStrings);

	}

}
