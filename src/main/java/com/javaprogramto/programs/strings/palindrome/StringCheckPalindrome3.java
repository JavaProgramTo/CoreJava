package com.javaprogramto.programs.strings.palindrome;

public class StringCheckPalindrome3 {

	public static void main(String[] args) {

		String input1 = "hello";
		boolean isPalindrome = isPalindromeWithStringBuilder(input1);
		System.out.println("Is " + input1 + " palindrome? " + isPalindrome);

		String input2 = "abcba";
		isPalindrome = isPalindromeWithStringBuilder(input2);
		System.out.println("Is " + input2 + " palindrome? " + isPalindrome);
	}

	private static boolean isPalindromeWithStringBuilder(String input) {

		return input.equals(new StringBuilder(input).reverse().toString());
	}

}
