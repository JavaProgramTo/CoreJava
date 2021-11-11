package com.javaprogramto.programs.strings.substrin;

public class StringContainsSubstringExample {

	public static void main(String[] args) {

		String input = "hello world - welcome";
		String substring = "world";
		boolean isSubstring = input.contains(substring);

		System.out.println(isSubstring);

		substring = "llo";
		isSubstring = input.contains(substring);

		System.out.println(isSubstring);

		substring = "java";
		isSubstring = input.contains(substring);

		System.out.println(isSubstring);
		
		substring = "Hello";
		isSubstring = input.contains(substring);

		System.out.println(isSubstring);


	}
}
