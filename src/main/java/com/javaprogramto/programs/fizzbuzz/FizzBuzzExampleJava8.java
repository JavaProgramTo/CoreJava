package com.javaprogramto.programs.fizzbuzz;

import java.util.stream.IntStream;

/**
 * Java program to implement fizz buzz solution using java 8 streams.
 * 
 * @author javaprogramto.com
 *
 */
public class FizzBuzzExampleJava8 {

	public static void main(String[] args) {

		// limit the fizz buzz game
		int limit = 100;

		// staring number
		int currentNumber = 1;

		// IntStream to generate the numbers range from 1 to 100 and mapToObj() to get the right fizz buzz word.
		IntStream.rangeClosed(currentNumber, limit)
				.mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
				.forEach(System.out::println);
	}
}
