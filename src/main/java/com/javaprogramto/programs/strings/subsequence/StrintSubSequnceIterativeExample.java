package com.javaprogramto.programs.strings.subsequence;

public class StrintSubSequnceIterativeExample {

	public static void main(String[] args) {

		String otherString = "ABCDE";
		String subsequence = "ACE";

		boolean isValidSubsequence = checkSubsequence(otherString, subsequence);

		System.out.println(isValidSubsequence);

		otherString = "ABCDE";
		subsequence = "AEC";

		isValidSubsequence = checkSubsequence(otherString, subsequence);

		System.out.println(isValidSubsequence);

	}

	private static boolean checkSubsequence(String otherString, String subsequence) {

		// if the subsequence length is greather than subsequence, then inputs are not
		// valid and not subsequence.
		if (otherString.length() < subsequence.length()) {
			return false;
		}

		int subsequenceIndex = 0;
		for (int otherStringIndex = 0; otherStringIndex < otherString.length(); otherStringIndex++) {
			// whether there is a match or not with other string. we will increment other
			// string index by 1 always.

			if (otherString.charAt(otherStringIndex) == subsequence.charAt(subsequenceIndex)) {
				// if both characters are matching then incrementing the index of subsequence
				// string.
				subsequenceIndex++;
			}

		}

		// always subsequence length and sub sequence index should be same for a valid
		// sub sequence.
		return subsequence.length() == subsequenceIndex;
	}

}
