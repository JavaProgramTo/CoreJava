package com.javaprogramto.convert.chartostring;

/**
 * example to convert char to string in java using Character.toString() method.
 * 
 * @author javaprogramto.com
 *
 */
public class CharToStringExample1 {

	public static void main(String[] args) {

		// example 1

		char ch = 'c';

		String strC = Character.toString(ch);
		System.out.println("Example 1: ");
		System.out.println("Char in String : " + strC);
		System.out.println("returned string length : " + strC.length());

		// example 2

		char ch2 = 'z';

		String strZ = Character.toString(ch2);

		System.out.println("\nExample 2: ");
		System.out.println("Char in String : " + strZ);
		System.out.println("returned string length : " + strZ.length());

	}

}
