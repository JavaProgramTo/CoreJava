package com.javaprogramto.java8.collectors.tomap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMapExample {

	public static void main(String[] args) {
		List<String> numbersinStringList = new ArrayList<>();

		numbersinStringList.add("One");
		numbersinStringList.add("Two");
		numbersinStringList.add("Three");
		numbersinStringList.add("Four");
		numbersinStringList.add("Five");

		Map<String, Integer> map = numbersinStringList.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("List : "+numbersinStringList);
		System.out.println("Map : "+map);

	}

}
