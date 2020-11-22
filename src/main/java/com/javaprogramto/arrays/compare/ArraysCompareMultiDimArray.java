package com.javaprogramto.arrays.compare;

import java.util.Arrays;

public class ArraysCompareMultiDimArray {

	public static void main(String[] args) {

		// Creating integer array 1
		int[] intArray1 = new int[] { 1, 2, 3 };

		// Creating integer array 2
		int[] intArray2 = new int[] { 1, 2, 3 };

		// Creating integer array 3
		int[] intArray3 = new int[] { 1, 2, 3 };

		// Creating integer array 4
		int[] intArray4 = new int[] { 1, 2, 3 };

		// Creating two object arrays.

		int[][] intMultiArray1 = new int[][] { intArray1, intArray3 };
		int[][] intMultiArray2 = new int[][] { intArray2, intArray4 };

		// Comparing arrays with Arrays.equals() method
		boolean isSame = Arrays.equals(intMultiArray1, intMultiArray2);
		System.out.println("\nArray comparision with Arrays.equals(intMultiArray1, intMultiArray2)");
		if (isSame) {
			System.out.println("int intMultiArray1 and intMultiArray1 are same");
		} else {
			System.out.println("intMultiArray1 and intMultiArray1 are not same");
		}

	}

}
