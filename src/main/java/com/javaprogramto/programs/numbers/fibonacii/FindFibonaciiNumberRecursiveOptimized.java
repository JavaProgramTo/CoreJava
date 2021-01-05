package com.javaprogramto.programs.numbers.fibonacii;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class FindFibonaciiNumberRecursiveOptimized {

	public static void main(String[] args) {
		
		Map<Integer, Long> memory = new HashMap<>();
		
		long startTime = Instant.now().toEpochMilli();
		long finResult = fibonacii(30, memory);
		long endTime = Instant.now().toEpochMilli();

		System.out.println("30th fiboncaii number - " + finResult + " execution time " + (endTime - startTime) + " ms");

		// clearing the memoization map
		memory.clear();
		
		startTime = Instant.now().toEpochMilli();
		finResult = fibonacii(50, memory);
		endTime = Instant.now().toEpochMilli();

		System.out.println("50th fiboncaii number - " + finResult + " execution time " + (endTime - startTime) + " ms");
	}

	
	// fibonacii recursive
	private static long fibonacii(int n, Map<Integer, Long> memory) {
		
		if(memory.get(n) != null) {
			return memory.get(n);
		}

		if (n <= 2) {
			return 1;
		}

		long fib = fibonacii(n - 1, memory) + fibonacii(n - 2, memory);
		
		memory.put(n, fib);
		
		return fib;
	}
}
