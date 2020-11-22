package com.javaprogramto.arrays.compare;

import java.util.Arrays;

public class ArraysCompare {

	public static void main(String[] args) {

		// Creating integer array 1
		int[] intArray1 = new int[] { 1, 2, 3, 4, 5 };

		// Creating integer array 2
		int[] intArray2 = intArray1;

		// comparing arrays with == operator
		System.out.println("Array comparision with == operator");
		if (intArray1 == intArray2) {
			System.out.println("int array 1 and array 2 are equal ");
		} else {
			System.out.println("int array 1 and array 2 are not equal ");
		}

		// Comparing arrays with Arrays.equals() method
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println("\nArray comparision with Arrays.equals(intArray1, intArray2)");
		if (isSame) {
			System.out.println("int array 1 and array 2 are same");
		} else {
			System.out.println("int array 1 and array 2 are not same");
		}

	}

}
