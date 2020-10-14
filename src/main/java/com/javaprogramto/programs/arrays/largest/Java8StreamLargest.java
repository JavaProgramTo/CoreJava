package com.javaprogramto.programs.arrays.largest;

import java.util.Arrays;

public class Java8StreamLargest {

	public static void main(String[] args) {

		// Creating unsorted array 1
		int[] arr = { 15, 3, 67, 8, 20 };
		System.out.println("Input array 1: " + Arrays.toString(arr));

		// using java 8 stream(), max() methods.
		int largest = Arrays.stream(arr).max().getAsInt();

		System.out.println("largest value : " + largest);

		// Creating unsorted array 1
		int[] arr2 = { 900, -100, 500, 15000, 8377 };
		System.out.println("Input array 2: " + Arrays.toString(arr2));

		// using java 8 stream(), max() and getAsInt() methods
		largest = Arrays.stream(arr2).max().getAsInt();

		System.out.println("largest value : " + largest);

	}

}
