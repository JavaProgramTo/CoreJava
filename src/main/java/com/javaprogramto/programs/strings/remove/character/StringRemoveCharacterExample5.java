package com.javaprogramto.programs.strings.remove.character;

import org.apache.commons.lang3.StringUtils;

public class StringRemoveCharacterExample5 {

	public static void main(String[] args) {

		String input = "hello +world ++";
		char removalCh = '+';

		String output = StringUtils.remove(input, removalCh);

		System.out.println("Input string 1 : " + input);
		System.out.println("Output string after removing the + symbol : " + output);
	}
}
