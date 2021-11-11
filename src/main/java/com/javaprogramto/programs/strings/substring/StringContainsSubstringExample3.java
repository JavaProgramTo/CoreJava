package com.javaprogramto.programs.strings.substrin;

import java.util.regex.Pattern;

public class StringContainsSubstringExample3 {

	public static void main(String[] args) {

		String input = "hello world - welcome";
		String substring = "world";
		boolean isPatternMatched = input.matches("(?i).*" + Pattern.quote(substring) + ".*");

		System.out.println(isPatternMatched);

		substring = "llo";
		isPatternMatched = input.matches("(?i).*" + Pattern.quote(substring) + ".*");

		System.out.println(isPatternMatched);

		substring = "java";
		isPatternMatched = input.matches("(?i).*" + Pattern.quote(substring) + ".*");

		System.out.println(isPatternMatched);

	}
}
