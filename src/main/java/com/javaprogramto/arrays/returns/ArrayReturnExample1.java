package com.javaprogramto.arrays.returns;

import java.util.Arrays;

public class ArrayReturnExample1 {

	public static void main(String[] args) {

		int[] first5Numbers = getNumbers();

		System.out.println("Array returned from method : " + Arrays.toString(first5Numbers));

	}

	// returning an array from method
	public static int[] getNumbers() {

		int[] numbers = { 1, 2, 3, 4, 5 };

		return numbers;
	}
}
