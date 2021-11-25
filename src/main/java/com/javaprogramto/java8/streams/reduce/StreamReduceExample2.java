package com.javaprogramto.java8.streams.reduce;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample2 {

	public static void main(String[] args) {

		Integer sumOf1to7 = 28;

		List<Integer> numbers = Arrays.asList(8, 9, 10);

		Integer sum = numbers.stream().reduce(sumOf1to7, (currentSum, nextValue) -> currentSum + nextValue);

		System.out.println("sum of first 10 numbers is " + sum);
	}

}
