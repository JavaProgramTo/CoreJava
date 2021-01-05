package com.javaprogramto.programs.numbers.fibonacii;

import java.time.Instant;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class PrintFibonaciiSeriesRecursiveOptimized {

	public static void main(String[] args) {

		long fibResult = 0;
		Map<Integer, Long> memory = new HashedMap<>();

		System.out.println("First 30 fibonacii series numbers : ");
		long startTime = Instant.now().toEpochMilli();

		for (int i = 1; i < 30; i++) {
			fibResult = fibonacii(i, memory);
			memory.clear();
			System.out.print(fibResult + " ");
		}
		long endTime = Instant.now().toEpochMilli();

		System.out.println("\nExecution time " + (endTime - startTime) + " ms");

		memory.clear();
		
		System.out.println("\nFirst 50 fibonacii series numbers : ");
		startTime = Instant.now().toEpochMilli();

		for (int i = 1; i < 50; i++) {
			fibResult = fibonacii(i, memory);
			memory.clear();
			System.out.print(fibResult + " ");
		}
		endTime = Instant.now().toEpochMilli();

		System.out.println("\nExecution time " + (endTime - startTime) + " ms");

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
