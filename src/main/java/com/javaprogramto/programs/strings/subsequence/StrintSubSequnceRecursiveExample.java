package com.javaprogramto.programs.strings.subsequence;

public class StrintSubSequnceRecursiveExample {

	public static void main(String[] args) {

		String otherString = "ABCDE";
		String subsequence = "ACE";

		boolean isValidSubsequence = checkSubsequence(otherString, subsequence, otherString.length(),
				subsequence.length());

		System.out.println(isValidSubsequence);

		otherString = "ABCDE";
		subsequence = "AEC";

		isValidSubsequence = checkSubsequence(otherString, subsequence, otherString.length(), subsequence.length());

		System.out.println(isValidSubsequence);

	}

	private static boolean checkSubsequence(String otherString, String subsequence, int otherLength, int subLength) {

		// if at any point if the sub sequence length becomes zero mean all character of
		// sub sequence are matched
		// or if other is reached 0 index and sub sequences also reached 0 index at the
		// same time then it is a valid sub sequence. so because of this we are first
		// checking the sub sequence length 0
		if (subLength == 0) {
			return true;
		}

		if (otherLength == 0) {
			return false;
		}

		// comparing the last characters first and then going backward for the previous
		// letters comparison.
		if (otherString.charAt(otherLength - 1) == subsequence.charAt(subLength - 1)) {
			// if matched then decrement the legth for the both strings.
			return checkSubsequence(otherString, subsequence, otherLength - 1, subLength - 1);
		} else {
			// if no match then decrement only for the other string. because sub sequence
			// current character is not matched yet
			return checkSubsequence(otherString, subsequence, otherLength - 1, subLength);
		}
	}

}
