package com.javaprogramto.java8.sorting.list;

import java.util.ArrayList;
import java.util.List;

public class ListNativeMinMaxExample {

	private static int getMinValue(List<Integer> numbers) {
		int min = Integer.MAX_VALUE;
		if (numbers.size() > 0) {

			for (Integer currentNumber : numbers) {

				if (min > currentNumber) {
					min = currentNumber;
				}
			}
		}
		return min;
	}

	private static int getMaxValue(List<Integer> numbers) {
		int max = Integer.MIN_VALUE;
		if (numbers.size() > 0) {

			for (Integer currentNumber : numbers) {

				if (max < currentNumber) {
					max = currentNumber;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		// creating a list to store the integer values
		List<Integer> numbers = new ArrayList<>();

		// adding integer values
		numbers.add(23);
		numbers.add(45);
		numbers.add(76);
		numbers.add(9);
		numbers.add(10);

		// getting the min value using min() method
		int min = getMinValue(numbers);

		// getting max value using max() method
		int max = getMaxValue(numbers);

		System.out.println("Native method - min : " + min + ", max : " + max);
	}

}
