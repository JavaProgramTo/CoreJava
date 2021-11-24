
package com.javaprogramto.java8.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerMinExample {

	public static void main(String[] args) {

		// divideUnsigned examples
		Integer integer1 = Integer.min(10, 20);
		System.out.println("Result of min two int values (10, 20) : " + integer1);

		Integer integer2 = Integer.min(-20, 10);
		System.out.println("Result of min two int values (-20, 10) : " + integer2);

		Integer integer3 = Integer.min(-10, -10);
		System.out.println("Result of min two int values (-10, -10) : " + integer3);

		List<Integer> intList = Arrays.asList(40, 50, 10, 20, 30);

		Optional<Integer> minOptional = intList.stream().reduce(Integer::min);

		if (minOptional.isPresent()) {
			System.out.println("min is " + minOptional.get());
		}
	}
}
