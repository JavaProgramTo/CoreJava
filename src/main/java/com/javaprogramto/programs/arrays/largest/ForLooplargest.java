package com.javaprogramto.programs.arrays.largest;

import java.util.Arrays;

public class ForLooplargest {

	public static void main(String[] args) {

		// Creating unsorted array 1
		int[] arr = { 15, 3, 67, 8, 20 };
		System.out.println("Input array 1: " + Arrays.toString(arr));

		// calling a method to get the large value.
		int largest = getLargestNumber(arr);

		System.out.println("largest value : " + largest);

		// Creating unsorted array 1
		int[] arr2 = { 900, -100, 500, 15000, 8377 };
		System.out.println("Input array 2: " + Arrays.toString(arr2));

		// calling a method to get the large value.
		largest = getLargestNumber(arr2);

		System.out.println("largest value : " + largest);

	}

	private static int getLargestNumber(int[] arr) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
