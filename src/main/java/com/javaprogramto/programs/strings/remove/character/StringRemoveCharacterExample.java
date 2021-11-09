package com.javaprogramto.programs.strings.remove.character;

public class StringRemoveCharacterExample {

	public static void main(String[] args) {

		String input = "hello world 00";

		String output = input.replaceAll("0", "");
		
		System.out.println("Input string 1 : "+input);
		System.out.println("Output string after removing the + symbol : "+output);
	}
}
