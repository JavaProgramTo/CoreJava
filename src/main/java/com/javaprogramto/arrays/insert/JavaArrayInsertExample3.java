package com.javaprogramto.arrays.insert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayInsertExample3 {

	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("orininal array - " + Arrays.toString(array));
		int index = 5;
		int value = 10;

		Integer[] newArray = insertArray(array, index, value);
		System.out.println("New array after insertion - " + Arrays.toString(newArray));

	}

	private static Integer[] insertArray(Integer[] array, int index, int value) {

		int length = array.length;

		if (index > length) {
			throw new RuntimeException("Invalid index - " + index);
		}

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

		list.add(index - 1, value);

		Integer[] newArray = list.toArray(array);

		return newArray;
	}

}
