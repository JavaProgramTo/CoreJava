package com.javaprogramto.java8.set.tostring;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8SetToStringExample2 {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();

		hashSet.add("java");
		hashSet.add("c++");
		hashSet.add("python");

		String str1 = hashSet.stream().collect(Collectors.joining(":", "{", "}"));
		

		System.out.println("Collectors.joining() hashset in string - " + str1);

		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("javascript");
		linkedHashSet.add("typescript");

		String str2 = linkedHashSet.stream().collect(Collectors.joining(":", "{", "}"));
		System.out.println("Collectors.joining() linkedhashset in string - " + str2);
		
	}
}
