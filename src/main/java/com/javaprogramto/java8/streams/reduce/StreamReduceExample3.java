package com.javaprogramto.java8.streams.reduce;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample3 {

	public static void main(String[] args) {

		Integer sumOf1to2 = 3;

		List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10);

		Integer sum = numbers.stream().reduce(sumOf1to2, (currentSum, nextValue) -> currentSum + nextValue);

		System.out.println("Without combiner - sum of first 10 numbers is " + sum);

		Integer sumWithCombiner = numbers.stream().reduce(sumOf1to2, (currentSum, nextValue) -> currentSum + nextValue,
				Integer::sum);

		System.out.println("With Combiner - sum of first 10 numbers is " + sumWithCombiner);

	}
}
