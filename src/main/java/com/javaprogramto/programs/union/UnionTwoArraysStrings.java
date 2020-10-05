package com.javaprogramto.programs.union;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionTwoArraysStrings {

	public static void main(String[] args) {

		// Integer array 1
		String[] array1 = { "A", "B", "C", "D" };
		System.out.println("String Array 1 : " + Arrays.toString(array1));

		// Integer array 2
		String[] array2 = { "C", "D", "E", "F" };
		System.out.println("String  Array 2 : " + Arrays.toString(array2));

		// creating a new Set
		Set<String> unionOfArrays = new HashSet<>();

		// adding the first array to set
		unionOfArrays.addAll(Arrays.asList(array1));

		// adding the second array to set
		unionOfArrays.addAll(Arrays.asList(array2));

		// converting set to array.
		String[] unionArray = {};
		unionArray = unionOfArrays.toArray(unionArray);

		// printing the union of two arrays.
		System.out.println("Union of two String arrays: " + Arrays.toString(unionArray));

	}

}
