package com.javaprogramto.arrays.toiterabale;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Example to convert Java Array to Iterable before Java 8
 * 
 * @author javaprogramto.com
 *
 */
public class JavaArrayToIterableExample {

	public static void main(String[] args) {

		// string array
		String[] names = new String[] {"john", "Amal", "Paul"};
		
		// string array to list conversion
		List<String> namesList = Arrays.asList(names);
		
		// List to iterable
		Iterator<String> it = namesList.iterator();
		
		// printing each value from iterator.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
