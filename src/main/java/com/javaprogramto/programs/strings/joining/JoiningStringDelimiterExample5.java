package com.javaprogramto.programs.strings.joining;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoiningStringDelimiterExample4 {

	public static void main(String[] args) {

		// input 1
		String output1 = stringCollectorsJoiningWithDelimiter("-", "hello", "world", "welcome", "to", "java",
				"programs");
		System.out.println("Ouptut 1 : " + output1);

		// input 1
		String output2 = stringCollectorsJoiningWithDelimiter("**", "this", "is", "second", "input");
		System.out.println("Ouptut 2 : " + output2);

	}

	private static String stringCollectorsJoiningWithDelimiter(String delimiter, String... strings) {

		String output = Arrays.stream(strings).collect(Collectors.joining(delimiter));

		return output;
	}
}
