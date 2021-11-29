package com.javaprogramto.arrays.booleanarray;

public class BooleanArrayExample2 {

	public static void main(String[] args) {

		// way 1
		boolean[] array1 = { false, true, true };

		// way 2
		boolean[] array2 = new boolean[4];

		array2[0] = true;
		array2[1] = false;
		array2[2] = true;
		array2[3] = false;

		// way 3
		boolean[] array3 = new boolean[5];

		for (int i = 0; i < array3.length; i++) {
			array3[i] = i % 2 == 0;
		}

	}
}
