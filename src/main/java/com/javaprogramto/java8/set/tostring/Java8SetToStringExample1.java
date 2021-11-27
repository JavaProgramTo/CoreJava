package com.javaprogramto.java8.set.tostring;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Java8SetToStringExample1 {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();

		hashSet.add("java");
		hashSet.add("c++");
		hashSet.add("python");

		String str1 = String.join(" ", hashSet);

		System.out.println("String.join() hashset in string - " + str1);

		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("javascript");
		linkedHashSet.add("typescript");

		String str2 = String.join(" ", linkedHashSet);
		System.out.println("String.join() linkedhashset in string - " + str2);
		
		System.out.println("With different delimiter");
		String str3 = String.join("**", hashSet);

		System.out.println("String.join() hashset to string - " + str3);

		String str4 = String.join("^^", linkedHashSet);
		System.out.println("String.join() linkedhashset to string - " + str4);
	}
}
