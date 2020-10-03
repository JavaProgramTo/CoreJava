package com.javaprogramto.programs.conversions.string;

public class StringtoStringArraySplitRegularExpression {

	public static void main(String[] args) {

		//  input string
		String input = "hello geek";
		
		// splitting string into string array using  split() method with regular expression.
		String[] stringArray = input.split("(?!^)");
		
		// printing the values of string array
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		System.out.println(stringArray.length);
		System.out.println(input.length());
		
	}

}
