
package com.javaprogramto.java8.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerMinMaxSumStreamsExample {

	public static void main(String[] args) {
		// Integer max with stream api
		List<Integer> maxIntList = Arrays.asList(40, 50, 10, 20, 30);

		Optional<Integer> maxOptional = maxIntList.stream().reduce(Integer::max);

		if (maxOptional.isPresent()) {
			System.out.println("max is " + maxOptional.get());
		}
		
		// Integer sum with stream api
		List<Integer> sumIntList = Arrays.asList(10, 20, 30, 40, 50);

		Optional<Integer> sumOptional = sumIntList.stream().reduce(Integer::sum);

		if (sumOptional.isPresent()) {
			System.out.println("sum is " + sumOptional.get());
		}

		// Integer min with stream api
		List<Integer> minIntList = Arrays.asList(40, 50, 10, 20, 30);

		Optional<Integer> minOptional = minIntList.stream().reduce(Integer::min);

		if (minOptional.isPresent()) {
			System.out.println("min is " + minOptional.get());
		}
	}
}
