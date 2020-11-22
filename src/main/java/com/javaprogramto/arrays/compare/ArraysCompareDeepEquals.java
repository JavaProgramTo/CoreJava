package com.javaprogramto.arrays.compare;

import java.util.Arrays;

public class ArraysCompareDeepEquals {

	public static void main(String[] args) {

		// Example 1 : Comparing object arrays with deepEquals() method

		// Creating integer array 1
		int[] intArray1 = new int[] { 1, 2, 3, 4, 5 };

		// Creating integer array 2
		int[] intArray2 = new int[] { 1, 2, 3, 4, 5 };

		// Creating two object arrays.

		Object[] objectArray1 = new Object[] { intArray1 };
		Object[] objectArray2 = new Object[] { intArray2 };

		System.out.println("Object arrays comparision with deepEquals() method");
		System.out.println("objectArray1 and objectArray2 are  : "
				+ (Arrays.deepEquals(objectArray1, objectArray2) ? "same" : "not same"));

		// Example 2 : Comparing integer nested arrays with deepEquals() method

		// Creating integer array 1
		intArray1 = new int[] { 1, 2, 3 };

		// Creating integer array 2
		intArray2 = new int[] { 1, 2, 3 };

		// Creating integer array 3
		int[] intArray3 = new int[] { 1, 2, 3 };

		// Creating integer array 4
		int[] intArray4 = new int[] { 1, 2, 3 };

		// Creating two object arrays.

		int[][] intMultiArray1 = new int[][] { intArray1, intArray3 };
		int[][] intMultiArray2 = new int[][] { intArray2, intArray4 };

		// Comparing arrays with Arrays.deepEquals() method
		System.out.println("intMultiArray1 and intMultiArray1 are  : "
				+ (Arrays.deepEquals(intMultiArray1, intMultiArray2) ? "same" : "not same"));

	}

}
