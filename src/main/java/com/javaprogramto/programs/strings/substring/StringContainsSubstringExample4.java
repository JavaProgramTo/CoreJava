package com.javaprogramto.programs.strings.substrin;

import org.apache.commons.lang3.StringUtils;

public class StringContainsSubstringExample4 {

	public static void main(String[] args) {

		// StringUtils.contains() example
		String input = "hello world - welcome";
		String substring = "world";
		boolean isPatternMatched = StringUtils.contains(input, substring);

		System.out.println(isPatternMatched);

		// StringUtils.containsIgnoreCase() example
		substring = "Hello";
		isPatternMatched = StringUtils.containsIgnoreCase(input, substring);

		System.out.println(isPatternMatched);

		// StringUtils.isIndexFound() example
		substring = "welco";
		int isIndexFound = StringUtils.indexOf(input, substring);

		System.out.println(isIndexFound);

	}
}
