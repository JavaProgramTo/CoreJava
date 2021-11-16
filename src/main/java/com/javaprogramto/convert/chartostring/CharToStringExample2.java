package com.javaprogramto.convert.chartostring;

/**
 * example to convert char to string in java using String.valueOf() method.
 * 
 * @author javaprogramto.com
 *
 */
public class CharToStringExample2 {

	public static void main(String[] args) {

		// example 1
		char ch3 = 'x';

		String strC = String.valueOf(ch3);
		System.out.println("String.valueOf Example 1: ");
		System.out.println("Char in String : " + strC);
		System.out.println("returned string length : " + strC.length());

		// example 2
		char ch4 = '7';

		String strZ = String.valueOf(ch4);

		System.out.println("\nString.valueOf Example 2: ");
		System.out.println("Char in String : " + strZ);
		System.out.println("returned string length : " + strZ.length());

	}

}
