package com.javaprogramto.arrays.compare;

import java.util.Arrays;

public class ArraysCompareAnyType {

	public static void main(String[] args) {

		// Creating double array 1
		double[] doubleArray1 = new double[] { 1, 2, 3, 4, 5 };

		// Creating double array 2
		double[] doubleArray2 = new double[] { 1, 2, 3, 4, 5 };

		// Comparing arrays with Arrays.equals() method

		System.out.println("Double arrays are equal : " + Arrays.equals(doubleArray1, doubleArray2));

		// Creating boolean array 1
		boolean[] booleanArray1 = new boolean[] { true, true, false };

		// Creating boolean array 2
		boolean[] booleanArray2 = new boolean[] { true, true, false };

		System.out.println("boolean arrays are equal : " + Arrays.equals(booleanArray1, booleanArray2));
	}
}
