package com.javaprogramto.programs.strings.substrin;

public class StringContainsSubstringExample2 {

	public static void main(String[] args) {

		String input = "hello world - welcome";
		String substring = "world";
		int index = input.indexOf(substring);

		System.out.println(index);

		substring = "llo";
		index = input.lastIndexOf(substring);

		System.out.println(index);

		substring = "java";
		index = input.indexOf(substring);

		System.out.println(index);
		
		substring = "Hello";
		index = input.lastIndexOf(substring);

		System.out.println(index);

	}
}
