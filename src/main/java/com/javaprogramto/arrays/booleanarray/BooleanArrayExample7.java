package com.javaprogramto.arrays.booleanarray;

import java.util.Arrays;

public class BooleanArrayExample7 {

	public static void main(String[] args) {

		boolean[] array1 = {};
		System.out.println("array1 length - " + array1.length);

		boolean[] array2 = new boolean[2];
		System.out.println("array2 values - " + Arrays.toString(array2));

		for (int i = 0; i < array2.length; i++) {
			array2[i] = true;
		}

		System.out.println("New array2 values - " + Arrays.toString(array2));

		System.out.println("Acccessing array values by index - " + array2[1]);

		boolean[] array7 = new boolean[5];

		System.out.println("Default values of array7 are " + Arrays.toString(array7));

		Arrays.fill(array7, true);

		System.out.println("New Default values of array7 are " + Arrays.toString(array7));
	}
}
