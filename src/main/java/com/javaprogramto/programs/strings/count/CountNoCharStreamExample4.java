package com.javaprogramto.programs.strings.count;

public class CountNoCharStreamExample4 {

	public static void main(String[] args) {

		String givenString = "hello world";

		char givenChar = 'l';

		long count = givenString.chars()
								.filter(c -> c == givenChar)
								.reduce(0, (a, b) -> a + 1);

		System.out.println("no of occurrences of char 'l' is " + count);
	}

}
