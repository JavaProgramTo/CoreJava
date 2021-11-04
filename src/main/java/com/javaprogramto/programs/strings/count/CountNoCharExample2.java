package com.javaprogramto.programs.strings.count;

public class CountNoCharExample2 {

	public static void main(String[] args) {

		String givenString = "hello world";
		
		char givenChar = 'l';

		int strOriginalLength = givenString.length();
		
		String replacedString = givenString.replace(String.valueOf(givenChar), "");

		int count = strOriginalLength - replacedString.length();
		
		System.out.println("no of occurrences of char 'l' is "+count);
	}

}
