package com.javaprogramto.programs.arrays.duplicates;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		// creating an array
		int[] inputArray = new int[] { 1, 1, 2, 2, 3, 6, 6, 7, 8, 8, 9, 9 };

		// first element into new int variable
		int currentValue = inputArray[0];

		// boolean variable to check the array value is already found or not.
		boolean found = false;

		// core logic to remove duplicates.
		for (int i = 0; i < inputArray.length; i++) {
			if (currentValue == inputArray[i] && !found) {
				found = true;
			} else if (currentValue != inputArray[i]) {

				// printing value
				System.out.print(" " + currentValue);
				currentValue = inputArray[i];
				found = false;
			}
		}
		System.out.print(" " + currentValue);

	}

}
