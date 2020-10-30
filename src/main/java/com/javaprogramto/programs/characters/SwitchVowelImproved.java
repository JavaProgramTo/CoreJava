package com.javaprogramto.programs.characters;

public class SwitchVowelImproved {

	public static void main(String[] args) {

		checkVowelOtNotWithSwitch('E');
		checkVowelOtNotWithSwitch('r');

		// Upper case test
		checkVowelOtNotWithSwitch('O');
		checkVowelOtNotWithSwitch('P');

	}

	/**
	 * checks the given the character is vowel or not and prints the appropriate
	 * text.
	 * 
	 * @param ch
	 */
	private static void checkVowelOtNotWithSwitch(char ch) {
		switch (ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U': {

			System.out.println(ch + " is a vowel");
			break;
		}
		default:
			System.out.println(ch + " is a consonant");
			break;
		}

	}

}
