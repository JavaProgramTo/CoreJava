package com.javaprogramto.arrays.insert;

import java.util.Arrays;

public class JavaArrayInsertExample1 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("orininal array - " + Arrays.toString(array));
		int index = 5;
		int value = 10;

		int[] newArray = insertArray(array, index, value);
		System.out.println("New array after insertion - " + Arrays.toString(newArray));

	}

	private static int[] insertArray(int[] array, int index, int value) {

		int length = array.length;

		if (index > length) {
			throw new RuntimeException("Invalid index - " + index);
		}

		int[] newArray = new int[length + 1];

		int temp = 0;

		for (int i = 0; i < length; i++) {

			if (i <= index - 1) {
				newArray[i] = array[i];
			} else if (i == index) {
				temp = array[i];
				newArray[index] = value;
			} else {
				newArray[i] = temp;
				temp = array[i];
			}

		}

		newArray[newArray.length - 1] = temp;

		return newArray;
	}

}
