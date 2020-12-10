package com.javaprogramto.convert.string.toint;

/**
 * Example to exception in string to integer conversion
 * 
 * @author Javaprogramto.com
 *
 */
public class StringToIntException {

	public static void main(String[] args) {

		// creating string with alphabets
		String s = "hello world";

		// convert string to int using parseInt() method. This will throw exception
		// int number = Integer.parseInt(s);
		// int number = Integer.valueOf(s);
		Integer number = new Integer(s);

		// printing vlaues
		System.out.println("Number : " + number);
	}
}
