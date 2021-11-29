package com.javaprogramto.arrays.booleanarray;

public class BooleanArrayExample5 {

	public static void main(String[] args) {

		boolean[] array5 = new boolean[5];

		System.out.println("Default value of array5 at index 1 is - " + array5[1]);

		System.out.println("Setting to true for all indexes of array 5 using simple for loop");
		for (int i = 0; i < array5.length; i++) {
			array5[i] = true;
		}
		System.out.println("Now Default value of array5 at index 1 is - " + array5[1]);

	}
}
