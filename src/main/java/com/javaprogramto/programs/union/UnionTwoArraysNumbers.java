package com.javaprogramto.programs.union;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionTwoArraysNumbers {

	public static void main(String[] args) {

		// Integer array 1
		Integer[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Array 1 : " + Arrays.toString(array1));

		// Integer array 2
		Integer[] array2 = { 2, 4, 6, 8, 10, 12, 14 };
		System.out.println("Array 2 : " + Arrays.toString(array2));

		// creating a new Set
		Set<Integer> unionOfArrays = new HashSet<>();

		// adding the first array to set
		unionOfArrays.addAll(Arrays.asList(array1));

		// adding the second array to set
		unionOfArrays.addAll(Arrays.asList(array2));

		// converting set to array.
		Integer[] unionArray = {};
		unionArray = unionOfArrays.toArray(unionArray);

		// printing the union of two arrays.
		System.out.println("Union of two arrays: " + Arrays.toString(unionArray));

	}

}
