package com.javaprogramto.arrays.toiterabale;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * 
 * Example to convert Java Array to Iterable using Java 8 Arrays.stream()
 * 
 * @author javaprogramto.com
 *
 */
public class JavaArrayToIterableExampleJava8 {

	public static void main(String[] args) {

		// string array
		String[] names = new String[] {"john", "Amal", "Paul"};

		System.out.println("Multi line solution");
		// Convert string array to Stream<String>
		Stream<String> namesList = Arrays.stream(names);
		
		// Stream to iterable
		Iterator<String> it = namesList.iterator();
		
		// printing each value from iterator.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// singel line
		System.out.println("\nIn single line");
		Arrays.stream(names).iterator().forEachRemaining(name -> System.out.println(name));
	}
}
