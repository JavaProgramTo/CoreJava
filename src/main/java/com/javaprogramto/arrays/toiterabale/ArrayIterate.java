package com.javaprogramto.arrays.toiterabale;

/**
 * 
 * Array Iterate example using loops
 * 
 * @author javaprogramto.com
 *
 */
public class ArrayIterate {

	public static void main(String[] args) {

		// string array
		String[] names = new String[] {"john", "Amal", "Paul"};
		
		// iterating array over its values.
		for(int index=0; index< names.length ; index++) {
			System.out.println(names[index]);
		}
	}
}
