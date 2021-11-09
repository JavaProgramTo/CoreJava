package com.javaprogramto.programs.strings.remove.character;

import java.util.regex.Pattern;

public class StringRemoveCharacterExample2 {

	public static void main(String[] args) {

		String input = "hello +world ++";

		String output = input.replaceAll(Pattern.quote("+"), "");
		
		System.out.println("Input string 1 : "+input);
		System.out.println("Output string after removing the + symbol : "+output);
	}
}
