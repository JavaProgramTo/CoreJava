package com.javaprogramto.programs.strings.remove.character;

public class StringRemoveCharacterExample3 {

	public static void main(String[] args) {

		String input = "hello +world ++";
		char removalCh = '+';

		char[] chars = input.toCharArray();

		StringBuilder builder = new StringBuilder();

		for (char ch : chars) {

			if (ch != removalCh) {
				builder.append(ch);
			}

		}

		System.out.println("Input string 1 : " + input);
		System.out.println("Output string after removing the + symbol : " + builder.toString());
	}
}
