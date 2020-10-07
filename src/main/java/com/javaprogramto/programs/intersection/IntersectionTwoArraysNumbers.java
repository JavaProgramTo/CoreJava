package com.javaprogramto.programs.intersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Java program to get the intersection of two arrays.
 * 
 * @author javaprogramto.com
 *
 */
public class IntersectionTwoArraysNumbers {

	public static void main(String[] args) {

		// Integer array 1
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		System.out.println("Array 1 : " + Arrays.toString(array1));

		// Integer array 2
		Integer[] array2 = { 2, 4, 6, 8 };
		System.out.println("Array 2 : " + Arrays.toString(array2));

		// creating a new Set
		Set<Integer> unionOfArrays = new HashSet<>();

		// adding the first array to set
		unionOfArrays.addAll(Arrays.asList(array1));

		// Keeping the common values from array 2
		unionOfArrays.retainAll(Arrays.asList(array2));

		// converting set to array.
		Integer[] unionArray = {};
		unionArray = unionOfArrays.toArray(unionArray);

		// printing the union of two arrays.
		System.out.println("Inersection of two arrays of int numbers: " + Arrays.toString(unionArray));

	}

}
