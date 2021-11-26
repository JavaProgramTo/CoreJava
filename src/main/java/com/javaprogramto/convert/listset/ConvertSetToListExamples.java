package com.javaprogramto.convert.listset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class ConvertSetToListExamples {

	public static void main(String[] args) {

		// Set creation
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println("Original set values - " + numbers);

		// Way - 1 Using List.addAll()
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(numbers);

		System.out.println("list1 using list.addAll - " + list1);

		// Way - 2 Using List constructor
		List<Integer> list2 = new ArrayList<>(numbers);

		System.out.println("list2 using set constructor - " + list2);

		// Way - 3 Using Java 8 stream api
		List<Integer> list3 = numbers.stream().collect(Collectors.toList());

		System.out.println("list3 using java 8 api - " + list3);

		// Way - 4 Using Java 10 api
		List<Integer> list4 = List.copyOf(numbers);

		System.out.println("list4 using java 10 api - " + list4);

		// Way - 5 Using guava api
		List<Integer> list5 = Lists.newArrayList(numbers);

		System.out.println("list5 using guava api - " + list5);

		// Way - 6 Using apache commons api
		List<Integer> list6 = new ArrayList<>();
		CollectionUtils.addAll(list6, numbers);

		System.out.println("list6 using apache commons  api - " + list6);
	}
}
