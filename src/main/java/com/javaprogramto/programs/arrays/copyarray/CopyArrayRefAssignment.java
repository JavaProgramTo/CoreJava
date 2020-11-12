package com.javaprogramto.programs.arrays.copyarray;

import java.util.Arrays;

public class CopyArrayRefAssignment {

	public static void main(String[] args) {
		// creating an array

		int[] originalArray = { 1, 2, 3, 4, 5 };

		// assigning to the original array to new ref.
		int[] copiedArray = originalArray;

		// printing the arrays
		System.out.println("Original Array : " + Arrays.toString(originalArray));

		System.out.println("Copied Array : " + Arrays.toString(copiedArray));

		// changing the values in the original array

		originalArray[0] = 100;
		originalArray[4] = 500;

		// printing both arrays after modification

		System.out.println("\nPrinting values after original array modifications");
		System.out.println("Modified Original Array : " + Arrays.toString(originalArray));

		System.out.println("Copied Array : " + Arrays.toString(copiedArray));

	}

}
