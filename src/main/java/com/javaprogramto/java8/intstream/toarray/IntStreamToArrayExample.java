package com.javaprogramto.java8.intstream.toarray;

import java.util.stream.IntStream;

public class IntStreamToArrayExample {

	public static void main(String[] args) {
		
		IntStream oddNumbers = IntStream.iterate(1, i -> i +2);
		
		int[] oddArray = oddNumbers.limit(100).toArray();
		
		System.out.println("Odd array length - "+oddArray.length);

	}
}
