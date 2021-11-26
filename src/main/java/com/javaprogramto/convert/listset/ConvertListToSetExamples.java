package com.javaprogramto.convert.listset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

import com.google.common.collect.Sets;

public class ConvertListToSetExamples {

	public static void main(String[] args) {

		// List creation
		List<String> vowels = Arrays.asList("A", "E", "I", "O", "U");
		System.out.println("Original list values - " + vowels);

		// Way - 1 Using Set.addAll()
		Set<String> set1 = new HashSet<>();
		set1.addAll(vowels);

		System.out.println("set1 using set.addAll - " + set1);

		// Way - 2 Using Set constructor
		Set<String> set2 = new HashSet<>(vowels);

		System.out.println("set2 using set constructor - " + set2);

		// Way - 3 Using Java 8 stream api
		Set<String> set3 = vowels.stream().collect(Collectors.toCollection(HashSet::new));

		System.out.println("set3 using java 8 api - " + set3);

		// Way - 4 Using Java 10 api
		Set<String> set4 = Set.copyOf(vowels);

		System.out.println("set4 using java 10 api - " + set4);

		// Way - 5 Using guava api
		Set<String> set5 = Sets.newHashSet(vowels);

		System.out.println("set5 using guava api - " + set5);

		// Way - 6 Using apache commons api
		Set<String> set6 = new HashSet<>();
		CollectionUtils.addAll(set6, vowels);

		System.out.println("set5 using apache commons  api - " + set6);
	}
}
