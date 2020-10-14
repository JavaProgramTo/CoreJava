package com.javaprogramto.programs.arrays.largest;

import java.util.Arrays;

public class JavaSortLargest {

	public static void main(String[] args) {

		// Creating unsorted array 1
		int[] arr = { 15, 3, 67, 8, 20 };
		System.out.println("Input array 1: " + Arrays.toString(arr));

		// using arrays.sort() method.
		int largest = sortLargest(arr);

		System.out.println("largest value : " + largest);

		// Creating unsorted array 1
		int[] arr2 = { 900, -100, 500, 15000, 8377 };
		System.out.println("Input array 2: " + Arrays.toString(arr2));

		// using arrays.sort() method.
		largest = sortLargest(arr2);

		System.out.println("largest value : " + largest);

	}

	private static int sortLargest(int[] arr) {
		Arrays.sort(arr);

		return arr[arr.length - 1];
	}

}
