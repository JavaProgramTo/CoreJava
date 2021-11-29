package com.javaprogramto.arrays.booleanarray;

import java.util.Arrays;

public class BooleanArrayExample6 {

	public static void main(String[] args) {

		boolean[] array6 = new boolean[5];

		System.out.println("Default values of array5 are " + Arrays.toString(array6));

		Arrays.fill(array6, true);

		System.out.println("New Default values of array5 are " + Arrays.toString(array6));
	}
}
