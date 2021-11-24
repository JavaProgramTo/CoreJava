
package com.javaprogramto.java8.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerMaxExample {

	public static void main(String[] args) {

		// divideUnsigned examples
		Integer integer1 = Integer.max(10, 20);
		System.out.println("Result of max two int values (10, 20) : " + integer1);

		Integer integer2 = Integer.max(-20, 10);
		System.out.println("Result of max two int values (-20, 10) : " + integer2);

		Integer integer3 = Integer.max(-10, -10);
		System.out.println("Result of max two int values (-10, -10) : " + integer3);

		List<Integer> intList = Arrays.asList(40, 50, 10, 20, 30);

		Optional<Integer> maxOptional = intList.stream().reduce(Integer::max);

		if (maxOptional.isPresent()) {
			System.out.println("max is " + maxOptional.get());
		}
	}
}
