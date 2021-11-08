package com.javaprogramto.programs.strings.joining;

public class JoiningStringDelimiterExample3 {

	public static void main(String[] args) {

		// input 1
		String output1 = stringJoinWithDelimiter("-", "hello", "world", "welcome", "to", "java", "programs");
		System.out.println("Ouptut 1 : " + output1);

		// input 1
		String output2 = stringJoinWithDelimiter("**", "this", "is", "second", "input");
		System.out.println("Ouptut 2 : " + output2);

	}

	private static String stringJoinWithDelimiter(String delimiter, String... strings) {

		return String.join(delimiter, strings);
	}
}
