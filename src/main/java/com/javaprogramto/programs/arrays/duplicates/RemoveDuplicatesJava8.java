package com.javaprogramto.programs.arrays.duplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesJava8 {

	public static void main(String[] args) {
		// creating an array
		Integer[] arrayWithDuplicates = new Integer[] { 3, 5, 6, 2, 38, 5, 34, 5, 69, 8, 7, 6 };

		// Removing duplicates from array using java 8 stream api
		List<Integer> listWithoutDuplicatesValues = Arrays.asList(arrayWithDuplicates)
												.stream().distinct()
												.collect(Collectors.toList());

		// printing non duplicates as list.
		System.out.println(listWithoutDuplicatesValues);

	}

}
