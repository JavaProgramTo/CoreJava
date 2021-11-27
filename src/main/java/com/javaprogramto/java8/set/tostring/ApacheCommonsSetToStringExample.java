package com.javaprogramto.java8.set.tostring;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class ApacheCommonsSetToStringExample {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();

		hashSet.add("list");
		hashSet.add("set");
		hashSet.add("map");

		String str1 = StringUtils.join(hashSet);

		System.out.println("with default delimiter");
		System.out.println("hashset in string - " + str1);

		String str2 = StringUtils.join(hashSet, ":");

		System.out.println("with custom delimiter");
		System.out.println("hashset in string - " + str2);

	}
}
