package com.javaprogramto.arrays.multidimensional;

import java.util.Arrays;
import java.util.Collections;

public class NestedArraysExample2 {

	public static void main(String[] args) {

		int[] array1 = { 0, 0 };

		int[] array2 = new int[5];

		int[] array3 = new int[5];
		Arrays.fill(array3, 5);

		Integer[] array4 = Collections.nCopies(array3.length, 0).toArray(new Integer[0]);

		System.out.println("array1[0] value " + array1[0]);
		System.out.println("array2[0] value " + array2[0]);
		System.out.println("array3[0] value " + array3[0]);
		System.out.println("array4[0] value " + array4[0]);

	}

}
