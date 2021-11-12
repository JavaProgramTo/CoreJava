package com.javaprogramto.programs.strings.anagrams;

public class CheckStringsAnagramsExample2 {

	public static void main(String[] args) {

		String str1 = "abaac";
		String str2 = "caaba";

		boolean isAnagram = isStrinsAnagramsOptimized(str1, str2);
		System.out.println(isAnagram);

		str1 = "listen";

		str2 = "silent";

		isAnagram = isStrinsAnagramsOptimized(str1, str2);
		System.out.println(isAnagram);

		str1 = "aap";

		str2 = "pap";

		isAnagram = isStrinsAnagramsOptimized(str1, str2);
		System.out.println(isAnagram);

	}

	private static boolean isStrinsAnagramsOptimized(String str1, String str2) {

		// if two strings lengths are not same then return false
		if (str1.length() != str2.length()) {
			return false;
		}
		int arraySize = 256;

		int[] countsArray = new int[arraySize];

		// increment by 1 from str1, decrement by 1 from str2
		for (int i = 0; i < str1.length(); i++) {
			countsArray[str1.charAt(i)]++;
			countsArray[str2.charAt(i)]--;
		}

		// checking any value is non zero in the counts arrray.
		for (int i = 0; i < countsArray.length; i++) {
			if (countsArray[i] != 0) {
				return false;
			}
		}

		return true;
	}

}
