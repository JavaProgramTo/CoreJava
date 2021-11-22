package com.javaprogramto.arrays.returns;

import java.util.Arrays;

public class ArrayReturnExample4 {

	public static void main(String[] args) {

		int[][] multiArray = getMultiArray();

		System.out.println("Returned Multi dimentional array values : ");
		for(int[] a : multiArray) {
			System.out.println( Arrays.toString(a));
		}

	}

	// returning multi dimens
	public static int[][] getMultiArray() {

		int[][] multi = { { 1, 2, 3 }, { 4, 5, 6 } };
		return multi;

	}
}
