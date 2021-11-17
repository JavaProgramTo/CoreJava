package com.javaprogramto.arrays.add;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaArrayToAddExample3 {

	public static void main(String[] args) {

		Integer[] array = { 10, 20, 30, 40, 30, 40 };

		System.out.println("Initial array values " + Arrays.toString(array));

		Set<Integer> integers = new HashSet<>();

		for (int a : array) {
			integers.add(a);
		}

		int newValue = 50;

		integers.add(newValue);

		array = integers.toArray(array);

		System.out.println("Array after adding 50 value " + Arrays.toString(array));

	}
}
