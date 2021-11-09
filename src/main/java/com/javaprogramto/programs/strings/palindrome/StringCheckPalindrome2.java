package com.javaprogramto.programs.strings.palindrome;

public class StringCheckPalindrome2 {

	public static void main(String[] args) {

		String input1 = "hello";
		boolean isPalindrome = isPalindromeWithForLoop(input1);
		System.out.println("Is " + input1 + " palindrome? " + isPalindrome);

		String input2 = "abcba";
		isPalindrome = isPalindromeWithForLoop(input2);
		System.out.println("Is " + input2 + " palindrome? " + isPalindrome);
	}

	private static boolean isPalindromeWithForLoop(String input) {
		
		int length = input.length();
		for (int i = 0; i < length; i++) {

			if (input.charAt(i) != input.charAt(length - i - 1)) {
				return false;
			}

		}

		return true;
	}

}
