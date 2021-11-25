package com.javaprogramto.java8.streams.reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamReduceExample4 {

	public static void main(String[] args) {

		Integer identity = 0;

		
		IntStream numbers = IntStream.iterate(1, i -> i + 1);

		List<Integer> numList = numbers.limit(100000000).boxed().collect(Collectors.toList());

		long l1 = System.currentTimeMillis();
		Integer sum = numList.stream().reduce(identity, (currentSum, nextValue) -> currentSum + nextValue, Integer::sum);
		long l2 = System.currentTimeMillis();
		System.out.println("With sequential stream sum is " + sum + " in " + (l2 - l1) + " ms");

		
		long l3 = System.currentTimeMillis();
		Integer sumWithCombiner = numList.stream().parallel().reduce(identity,
				(currentSum, nextValue) -> currentSum + nextValue, Integer::sum);
		long l4 = System.currentTimeMillis();
		
		System.out
				.println("With parallel stream sum is " + sumWithCombiner + " in " + (l4 - l3) + " ms");

	}
}
