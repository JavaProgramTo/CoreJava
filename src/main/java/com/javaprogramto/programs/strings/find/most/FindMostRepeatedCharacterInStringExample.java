package com.javaprogramto.programs.strings.find.most;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.tuple.Pair;

public class FindMostRepeatedCharacterInStringExample {

	public static void main(String[] args) {

		String input = "hello world";

		Pair<Character, Integer> maxCharCountPair = getMostRepeatedCharacterFromString(input);

		System.out.println("Input string : " + input);
		System.out.println(maxCharCountPair.getKey() + " is the most repeated character for "
				+ maxCharCountPair.getValue() + " times.");

	}

	private static Pair<Character, Integer> getMostRepeatedCharacterFromString(String input) {

		Map<Character, Integer> countMap = new HashMap<>();

		char[] chars = input.toCharArray();

		// storing the char and its count in the hashmap
		for (char ch : chars) {

			if (!Character.isWhitespace(ch)) {

				Integer currentCount = countMap.get(ch);

				if (currentCount == null) {
					countMap.put(ch, 1);
				} else {
					countMap.put(ch, ++currentCount);
				}

			}
		}

		// getting the max count from counter map.
		Integer maxCharacterCount = Collections.max(countMap.values());

		char maxCharacter = Character.MIN_VALUE;

		// getting the max occurred character.
		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == maxCharacterCount) {
				maxCharacter = entry.getKey();
			}
		}

		return Pair.of(maxCharacter, maxCharacterCount);
	}

}
