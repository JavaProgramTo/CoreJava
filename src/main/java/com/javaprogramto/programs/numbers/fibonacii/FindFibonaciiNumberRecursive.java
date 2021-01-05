package com.javaprogramto.programs.numbers.fibonacii;

import java.time.Instant;

public class FindFibonaciiNumberRecursive {

	public static void main(String[] args) {
		long startTime = Instant.now().toEpochMilli();
		long finResult = fibonacii(30);
		long endTime = Instant.now().toEpochMilli();

		System.out.println("30th fiboncaii number - " + finResult + " execution time " + (endTime - startTime) + " ms");

		startTime = Instant.now().toEpochMilli();
		finResult = fibonacii(50);
		endTime = Instant.now().toEpochMilli();

		System.out.println("50th fiboncaii number - " + finResult + " execution time " + (endTime - startTime) + " ms");
	}

	
	// fibonacii recursive
	private static long fibonacii(long n) {

		if (n <= 2) {
			return 1;
		}

		return fibonacii(n - 1) + fibonacii(n - 2);
	}
}
