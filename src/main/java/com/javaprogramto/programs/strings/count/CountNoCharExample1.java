package com.javaprogramto.programs.strings.count;

public class CountNoCharExample1 {

	public static void main(String[] args) {

		String givenString = "hello world";
		
		char givenChar = 'l';

		int strLength = givenString.length();
		int count = 0;

		for (int i = 0; i < strLength; i++) {

			if(givenChar == givenString.charAt(i)) {
				count++;
			}
		}

		System.out.println("no of occurrences of char 'l' is "+count);
	}

}
