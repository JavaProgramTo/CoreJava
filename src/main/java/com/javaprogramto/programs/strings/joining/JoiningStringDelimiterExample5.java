package com.javaprogramto.programs.strings.joining;

import org.apache.commons.lang3.StringUtils;

public class JoiningStringDelimiterExample5 {

	public static void main(String[] args) {

		// input 1
		String output1 = stringCollectorsJoiningWithDelimiter("-", "hello", "world", "welcome", "to", "java",
				"programs");
		System.out.println("Ouptut 1 : " + output1);

		// input 1
		String output2 = stringCollectorsJoiningWithDelimiter("**", "this", "is", "second", "input");
		System.out.println("Ouptut 2 : " + output2);

		String out = "";

		for (int i = 0; i < 100000; i++) {
			out += "new value";
		}

	}

	private static String stringCollectorsJoiningWithDelimiter(String delimiter, String... strings) {

		String output = StringUtils.join(strings, delimiter);

		return output;
	}
}
