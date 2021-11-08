package com.javaprogramto.programs.strings.permutations;

import java.util.stream.IntStream;

public class StringPermutationsExample2 {

	public static void main(String[] args) {

		stringPermuteAndPrint("", "ABC");

	}

	// java 8 stream example
	private static void stringPermuteAndPrint(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print(prefix + " ");
		} else {
			IntStream.range(0, n).parallel().forEach(
					i -> stringPermuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
		}
	}

}
