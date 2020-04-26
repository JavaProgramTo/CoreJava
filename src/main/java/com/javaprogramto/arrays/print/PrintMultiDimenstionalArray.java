package com.javaprogramto.arrays.print;

import java.util.Arrays;

public class PrintMultiDimenstionalArray {

	public static void main(String[] args) {
		int[][] twoArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 0 } };

		System.out.println("Using Arrays.toString : " + Arrays.toString(twoArray));

		System.out.println("Using Arrays.toString : " + Arrays.deepToString(twoArray));

	}

}
