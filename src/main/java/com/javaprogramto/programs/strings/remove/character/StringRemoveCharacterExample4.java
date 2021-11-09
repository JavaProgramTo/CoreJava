package com.javaprogramto.programs.strings.remove.character;

import java.util.stream.Collectors;

public class StringRemoveCharacterExample4 {

	public static void main(String[] args) {

		String input = "hello +world ++";
		char removalCh = '+';

		String output = input.chars()
							.filter(ch -> ch != removalCh)
							.mapToObj(ch -> String.valueOf(ch))
							.collect(Collectors.joining());

		System.out.println("Input string 1 : " + input);
		System.out.println("Output string after removing the + symbol : " + output);
	}
}
