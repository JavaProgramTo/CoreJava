package com.javaprogramto.programs.strings.palindrome;

public class StringCheckPalindrome1 {

	public static void main(String[] args) {

		String input1 = "hello";
		boolean isPalindrome = isPalindrome(input1);
		System.out.println("Is " + input1 + " palindrome? " + isPalindrome);

		String input2 = "abcba";
		isPalindrome = isPalindrome(input2);
		System.out.println("Is " + input2 + " palindrome? " + isPalindrome);
	}

	private static boolean isPalindrome(String input) {

		int right = 0;
		int left = input.length() - 1;

		while (right <= left) {

			if (input.charAt(right) != input.charAt(left)) {
				return false;
			}

			right++;
			left--;
		}

		return true;
	}

}
