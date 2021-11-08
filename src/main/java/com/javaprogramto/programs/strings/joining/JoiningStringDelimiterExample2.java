package com.javaprogramto.programs.strings.joining;

import java.util.StringJoiner;

public class JoiningStringDelimiterExample2 {

	public static void main(String[] args) {

		// input 1
		String output1 = stringJoinerWithDelimiter("-", "hello", "world", "welcome", "to", "java", "programs");
		System.out.println("Ouptut 1 : " + output1);

		// input 1
		String output2 = stringJoinerWithDelimiter("**", "this", "is", "second", "input");
		System.out.println("Ouptut 2 : " + output2);

	}

	private static String stringJoinerWithDelimiter(String delimiter, String... strings) {

		StringJoiner stringJoinder = new StringJoiner(delimiter, "!!", "!!");
		for (String str : strings) {

			stringJoinder.add(str);
		}

		return stringJoinder.toString();
	}

}
