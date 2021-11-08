package com.javaprogramto.programs.strings.permutations;

public class StringPermutationsExample1 {

	public static void main(String[] args) {

		stringPermuteAndPrint("", "ABC");
	}

	private static void stringPermuteAndPrint(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(prefix + " ");
		} else {
			for (int i = 0; i < n; i++) {
				stringPermuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
			}
		}
	}

}
