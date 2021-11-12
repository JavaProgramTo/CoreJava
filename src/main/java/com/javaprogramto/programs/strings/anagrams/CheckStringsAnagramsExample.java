package com.javaprogramto.programs.strings.anagrams;

import java.util.Arrays;

public class CheckStringsAnagramsExample {

	public static void main(String[] args) {

		String str1 = "abaac";
		String str2 = "caaba";

		boolean isAnagram = isStrinsAnagrams(str1, str2);
		System.out.println(isAnagram);

		str1 = "listen";

		str2 = "silent";

		isAnagram = isStrinsAnagrams(str1, str2);
		System.out.println(isAnagram);

		str1 = "aap";

		str2 = "pap";

		isAnagram = isStrinsAnagrams(str1, str2);
		System.out.println(isAnagram);

	}

	private static boolean isStrinsAnagrams(String str1, String str2) {

		// converting str1 to char array
		char[] strCharArray1 = str1.toCharArray();

		// converting str2 to char array
		char[] strCharArray2 = str2.toCharArray();

		// sorting two strings char arrays using Arrays.sort() method
		Arrays.sort(strCharArray1);
		Arrays.sort(strCharArray2);

		// converting char arrays back to strings
		str1 = new String(strCharArray1);
		str2 = new String(strCharArray2);

		// comparing two strings
		if (str1.equals(str2))
			return true;

		return false;
	}

}
