package com.javaprogramto.programs.characters;

public class IfElseVowelImproved {

	public static void main(String[] args) {

		char ch = 'a';

		checkVowelOtNot(ch);
		checkVowelOtNot('z');
		
		// Upper case test
		checkVowelOtNot('A');
		checkVowelOtNot('X');

	}

	/**
	 * checks the given the character is vowel or not and prints the appropriate text.
	 * 
	 * @param ch
	 */
	private static void checkVowelOtNot(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Chracter '" + ch + "' is a vowel");
		} else {
			System.out.println("Chracter '" + ch + "' is a consonant");
		}

	}

}
