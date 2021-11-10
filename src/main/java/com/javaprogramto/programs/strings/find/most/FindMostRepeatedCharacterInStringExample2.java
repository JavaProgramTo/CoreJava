package com.javaprogramto.programs.strings.find.most;

import org.apache.commons.lang3.tuple.Pair;

public class FindMostRepeatedCharacterInStringExample2 {

	public static void main(String[] args) {

		String input = "hello world";

		Pair<Character, Integer> maxCharCountPair = getMostRepeatedCharacterFromString(input);

		System.out.println("Input string : " + input);
		System.out.println(maxCharCountPair.getKey() + " is the most repeated character for "
				+ maxCharCountPair.getValue() + " times.");

	}

	private static Pair<Character, Integer> getMostRepeatedCharacterFromString(String input) {

		int[] asciiIntArray = new int[256];

		char[] chars = input.toCharArray();

		int mostAppearanceCount = 0;
		char mostAppearedChar = Character.MIN_VALUE;

		// storing the char and its count in the hashmap
		for (char ch : chars) {

			if (!Character.isWhitespace(ch)) {

				int asciiCode = (int) ch;

				asciiIntArray[asciiCode]++;

				if (asciiIntArray[asciiCode] > mostAppearanceCount) {
					mostAppearanceCount = asciiIntArray[asciiCode];
					mostAppearedChar = ch;

				}

			}
		}

		return Pair.of(mostAppearedChar, mostAppearanceCount);
	}

}
