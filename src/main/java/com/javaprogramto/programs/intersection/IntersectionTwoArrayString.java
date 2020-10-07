package com.javaprogramto.programs.intersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Java program to get the intersection of two arrays with strings.
 * 
 * @author javaprogramto.com
 *
 */
public class IntersectionTwoArrayString {

	public static void main(String[] args) {

		// String array 1
		String[] array1 = { "A", "B", "C", "D" };
		System.out.println("Array 1 : " + Arrays.toString(array1));

		// String array 2
		String[] array2 = { "E", "A", "F", "B" };
		System.out.println("Array 2 : " + Arrays.toString(array2));

		// creating a new Set
		Set<String> unionOfArrays = new HashSet<>();

		// adding the first array to set
		unionOfArrays.addAll(Arrays.asList(array1));

		// Keeping the common values from array 2
		unionOfArrays.retainAll(Arrays.asList(array2));

		// converting set to array.
		String[] unionArray = {};
		unionArray = unionOfArrays.toArray(unionArray);

		// printing the union of two arrays.
		System.out.println("Inersection of two arrays of strings: " + Arrays.toString(unionArray));

	}

}
