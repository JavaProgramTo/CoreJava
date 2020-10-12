package com.javaprogramto.programs.arrays.search;

import java.util.Arrays;

public class IntStreamFindStringValue {

	public static void main(String[] args) {

		String[] stringArray = new String[] { "hello", "how", "life", "is", "going" };

		String findString = "java";

		boolean isFound = false;

		isFound = Arrays.stream(stringArray).anyMatch(value  -> value.equals(findString));

		if (isFound) {
			System.out.println("String " + findString + " is found in the array in java 8");
		} else {
			System.out.println("String " + findString + " is not found in the  array in java 8");
		}
	}

}
