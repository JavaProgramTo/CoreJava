package com.javaprogramto.programs.strings.joining;

public class JoiningStringDelimiterExample1 {

	public static void main(String[] args) {

		// input 1
		String output1 = joinStringsWithDelimiter("-", "hello", "world", "welcome", "to", "java", "programs");
		System.out.println("Ouptut 1 : " + output1);

		// input 1
		String output2 = joinStringsWithDelimiter("**", "this", "is", "second", "input");
		System.out.println("Ouptut 2 : " + output2);

	}

	/**
	 * Gets the joined string for the input strings with a given delimiter
	 * 
	 * @param delimiter
	 * @param strings
	 * @return
	 */
	private static String joinStringsWithDelimiter(String delimiter, String... strings) {

		StringBuilder stringBuilder = new StringBuilder();
		int index = 0;
		for (index = 0; index < strings.length - 1; index++) {

			stringBuilder.append(strings[index]).append(delimiter);
		}

		stringBuilder.append(strings[index]);

		return stringBuilder.toString();
	}

}
