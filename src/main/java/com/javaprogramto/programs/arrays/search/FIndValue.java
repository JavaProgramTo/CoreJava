package com.javaprogramto.programs.arrays.search;

public class FIndValue {

	public static void main(String[] args) {

		int[] array = { 1, 4, 6, 2, 5 };

		int findValueOf = 6;

		boolean isFound = false;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == findValueOf) {
				isFound = true;
				break;
			}

		}

		if (isFound) {
			System.out.println("Number " + findValueOf + " is found in the  array");
		} else {
			System.out.println("Number " + findValueOf + " is not found in the  array");
		}
	}

}
