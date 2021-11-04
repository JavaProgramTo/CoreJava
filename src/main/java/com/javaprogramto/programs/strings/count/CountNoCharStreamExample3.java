package com.javaprogramto.programs.strings.count;

public class CountNoCharStreamExample3 {

	public static void main(String[] args) {

		String givenString = "hello world";

		char givenChar = 'l';

		long count = givenString.chars().filter(c -> c == givenChar).count();

		System.out.println("no of occurrences of char 'l' is " + count);
	}

}
