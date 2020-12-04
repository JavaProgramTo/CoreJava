package com.javaprogramto.java8.foreach.index;

import java.util.stream.IntStream;

/**
 * Example program to run the forEach() loop with index in java 8 with an array of Strings.
 * 
 * @author JavaProgramTo.com
 *
 */

public class ForEachIndexArraysExample {

	public static void main(String[] args) {

		// Create an Array with Strings.
		String[] fruites = { "Mango", "Apple", "Orange", "Kiwi", "Avocado" };

		// getting length of an array.
		int length = fruites.length;

		// running foreach loop with index using IntStream.range() method with start and end index 
		// with filter() method.
		IntStream.range(0, length).filter(index -> fruites[index].contains("a"))
				.forEach(index -> System.out.println("Value at Index : " + (index + 1) + " is " + fruites[index]));

	}

}
