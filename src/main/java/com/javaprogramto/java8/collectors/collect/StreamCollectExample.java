package com.javaprogramto.java8.collectors.collect;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Examples to Java 8 Stream collect() method
 * 
 * @author JavaProgramTo.com
 *
 */
public class StreamCollectExample {

	public static void main(String[] args) {

		// toList() examples
		List<String> words = Arrays.asList("hello", "how", "are", "you", "doing", "mate");
		
		List<String> list = words.stream()
								 .map(word -> word.toUpperCase())
								 .collect(Collectors.toList());
		
		System.out.println("Collectors.toList() : "+list);

		
		List<String> numbers = Arrays.asList("one", "two", "one", "two", "three", "four");

		// using toSet()
		Set<String> set = numbers.stream().filter(number -> number.length() == 3).collect(Collectors.toSet());
		
		// without duplicates
		System.out.println("Set removes the duplicates : ");
		set.forEach(System.out::println);

		// using toList()
		List<String> list2 = numbers.stream().filter(number -> number.length() == 3).collect(Collectors.toList());
		
		// without duplicates
		System.out.println("List with duplicates: ");
		list2.forEach(System.out::println);
		
		// tomap() examples
		Map<String, Integer> wordsLength = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println("toMap() output: ");
		wordsLength.forEach((key, value) -> System.out.println(key + " = "+value));
		
		Map<String, String> wordsCount = numbers.stream().collect(Collectors.toMap(Function.identity(), Function.identity(), (oldValue, newValue) -> oldValue+" repeated"));
		
		System.out.println("toMap() with duplicates: ");
		wordsCount.forEach((key, value) -> System.out.println(key + " = "+value));
		
		// toCollection() examples
		// to linkedlist
		List<String> linkedList = words.stream().collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println("linkedList is instance of LinkedList = "+(linkedList instanceof LinkedList));
		
		// to linkedhashset
		Set<String> linkedhHashSet = words.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println("linkedhHashSet is instance of LinkedHashSet = "+(linkedhHashSet instanceof LinkedHashSet));
		
		// to linkedhashset
		Map<String, Integer> treeMap = words.stream().collect(Collectors.toMap(Function.identity(), String::length, (oldValue, newValue) -> newValue, TreeMap::new));
		System.out.println("treeMap is instance of TreeMap = "+(treeMap instanceof TreeMap));
	

	}

}
