package com.javaprogramto.programs.strings.palindrome;

import java.util.stream.IntStream;

public class StringCheckPalindrome4 {

	public static void main(String[] args) {

		String input1 = "hello";
		boolean isPalindrome = isPalindromeInJava8(input1);
		System.out.println("Is " + input1 + " palindrome? " + isPalindrome);

		String input2 = "abcba";
		isPalindrome = isPalindromeInJava8(input2);
		System.out.println("Is " + input2 + " palindrome? " + isPalindrome);
	}

	private static boolean isPalindromeInJava8(String input) {

		return IntStream.range(0, input.length() / 2)
				.noneMatch(index -> input.charAt(index) != input.charAt(input.length() - index - 1));

	}

}
