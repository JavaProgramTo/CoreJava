package com.javaprogramto.programs.conversions.string;

public class StringtoStringArraySplit {

	public static void main(String[] args) {

		//  input string
		String input = "javaprogramto.com";
		
		// spliting string into string array using  split() method.
		String[] stringArray = input.split("");
		
		// printing the values of string array
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		System.out.println(stringArray.length);
		System.out.println(input.length());
		
	}

}
