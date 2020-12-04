package com.javaprogramto.java8.foreach.index;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Example program to run the forEach() loop with index in java 8 with an List
 * of Strings.
 * 
 * @author JavaProgramTo.com
 *
 */

public class ForEachIndexListMapExample {

	public static void main(String[] args) {

		// Create a List with Strings.
		List<String> players = Arrays.asList("Warner", "Ponting", "Akthar", "Sachin", "Gary Christian");


        HashMap<Integer, String> collect = players
                .stream()
                .collect(HashMap<Integer, String>::new,
                        (map, streamValue) -> map.put(map.size(), streamValue),
                        (map, map2) -> {
                        });

        collect.forEach((k, v) -> System.out.println(k + ":" + v));

	}

}
