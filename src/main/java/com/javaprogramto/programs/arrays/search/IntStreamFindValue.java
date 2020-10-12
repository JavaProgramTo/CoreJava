package com.javaprogramto.programs.arrays.search;

import java.util.stream.IntStream;

public class IntStreamFindValue {

	public static void main(String[] args) {

		int[] array = { 10, 30, 20, 90, 40, 60 };

		int findValueOf = 90;

		boolean isFound = false;

		isFound = IntStream.of(array).anyMatch(condition -> condition == findValueOf);

		if (isFound) {
			System.out.println("Number " + findValueOf + " is found in the array in java 8");
		} else {
			System.out.println("Number " + findValueOf + " is not found in the  array in java 8");
		}
	}

}
