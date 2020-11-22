package com.javaprogramto.arrays.compare;

import java.util.Arrays;

public class ArraysCompareObjectIntegerArray {

	public static void main(String[] args) {

		// Creating integer array 1
		int[] intArray1 = new int[] { 1, 2, 3, 4, 5 };

		// Creating integer array 2
		int[] intArray2 = new int[] { 1, 2, 3, 4, 5 };

		// Creating two object arrays.

		Object[] objectArray1 = new Object[] { intArray1 };
		Object[] objectArray2 = new Object[] { intArray2 };

		// Comparing arrays with Arrays.equals() method
		boolean isSame = Arrays.equals(objectArray1, objectArray2);
		System.out.println("\nArray comparision with Arrays.equals(objectArray1, objectArray1)");
		if (isSame) {
			System.out.println("int objectArray1 and objectArray2 are same");
		} else {
			System.out.println("objectArray1 and objectArray2 are not same");
		}

	}

}
