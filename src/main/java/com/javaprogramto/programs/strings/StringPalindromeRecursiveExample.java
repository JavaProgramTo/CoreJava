package com.javaprogramto.programs.strings;

public class StringPalindromeRecursiveExample {

	public static void main(String[] args) {
		// input string 1234
		String string = "1234";
		/*
		 * If function returns true then the string is palindrome otherwise not
		 */
		if (isPalindrome(string))
			System.out.println(string + " is a palindrome");
		else
			System.out.println(string + " is not a palindrome");

		// input string 1234
		String string2 = "madam";
		/*
		 * If function returns true then the string is palindrome otherwise not
		 */
		if (isPalindrome(string2))
			System.out.println(string2 + " is a palindrome");
		else
			System.out.println(string2 + " is not a palindrome");

	}

	/**
	 * Recursive function to check the string is palindrome or not.
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(String s) {

		// if the string has one or zero characters then recursive call is stopped.
		if (s.length() == 0 || s.length() == 1)
			return true;

		// checking the first and last character of the string. if equals then call the
		// same function with substring from index 1 to length -1. Because substring
		// excludes the endIndex.
		// if these two values are not same then string is not Palindrome so this
		// returns false.
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));

		// this statment is executed if and if only first and last character of string
		// at any time is not equal.
		return false;
	}

}
