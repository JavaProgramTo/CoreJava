package com.javaprogramto.programs.characters;

public class IfElseVowel {

	public static void main(String[] args) {
		char ch = 'a';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Chracter '" + ch + "' is a vowel");
		} else {
			System.out.println("Chracter '" + ch + "' is a consonant");
		}

		ch = 'b';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Chracter '" + ch + "' is a vowel");
		} else {
			System.out.println("Chracter '" + ch + "' is a consonant");
		}

	}

}
