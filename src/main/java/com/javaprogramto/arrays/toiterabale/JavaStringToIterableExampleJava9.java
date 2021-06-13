package com.javaprogramto.arrays.toiterabale;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * 
 * Example to convert String to Iterable using Java 8 Arrays.stream()
 * 
 * @author javaprogramto.com
 *
 */
public class JavaStringToIterableExampleJava9 {

	public static void main(String[] args) {

		// string 
		String numbers = "1 2 3 4 5 6";

		// string to string array
		String[] numbersArray = numbers.split(" ");

		System.out.println("Multi line solution");
		// Convert string array to Stream<String>
		Stream<String> numbersList = Arrays.stream(numbersArray);
		
		// Stream to iterable
		Iterator<String> it = numbersList.iterator();
		
		// printing each value from iterator.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// singel line
		System.out.println("\nIn single line");
		Arrays.stream(numbersArray).iterator().forEachRemaining(name -> System.out.println(name));
	}
}
