
package com.javaprogramto.java8.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntegerSumExample {

	public static void main(String[] args) {

		//divideUnsigned examples
		Integer integer1 = Integer.sum(10, 20);
		System.out.println("Result of sum two int values (10, 20) : " + integer1);

		Integer integer2 = Integer.sum(-20, 10);
		System.out.println("Result of sum two int values (-20, 10) : " + integer2);

		Integer integer3 = Integer.sum(-10,- 10);
		System.out.println("Result of sum two int values (-10, -10) : " + integer3);
		
		List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
		
		Optional<Integer> sumOptional = intList.stream().reduce(Integer::sum);
		
		if(sumOptional.isPresent()) {
			System.out.println("sum is "+sumOptional.get());
		}
	}
}
