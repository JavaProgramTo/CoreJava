package com.javaprogramto.arrays.insert;

import java.util.Arrays;

public class JavaArrayInsertExample2 {

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

		for (int i = 0; i < length + 1; i++) {

			if (i < index - 1) {
				newArray[i] = array[i];
			} else if (i == index-1) {
				newArray[index] = value;
			} else {
				newArray[i] = array[i - 1];
			}

		}

		return newArray;
	}

}
