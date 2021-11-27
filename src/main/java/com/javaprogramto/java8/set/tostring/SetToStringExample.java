package com.javaprogramto.java8.set.tostring;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetToStringExample {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();

		hashSet.add("java");
		hashSet.add("c++");
		hashSet.add("python");

		String str1 = hashSet.toString();
		str1 = str1.replaceAll("\\,|\\[|\\]|\\s", " ");

		System.out.println("hashset in string - " + str1);

		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("javascript");
		linkedHashSet.add("typescript");

		String str2 = linkedHashSet.toString();
		str2 = str2.replaceAll("\\,|\\[|\\]|\\s", " ");
		System.out.println("linkedhashset in string - " + str2);

	}

}
