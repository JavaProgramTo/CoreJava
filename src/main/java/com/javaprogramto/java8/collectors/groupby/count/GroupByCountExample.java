package com.javaprogramto.java8.collectors.groupby.count;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Stream Group by count examples
 * 
 * @author JavaProgramTo.com
 *
 */

public class GroupByCountExample {

	public static void main(String[] args) {

		List<String> brands = new ArrayList<>();

		brands.add("Apple");
		brands.add("Google");
		brands.add("Nokia");
		brands.add("HTC");
		brands.add("HTC");
		brands.add("Google");
		brands.add("Google");
		brands.add("Google");
		brands.add("Apple");
		brands.add("Apple");
		brands.add("Apple");

		Map<String, Long> countByBrand = brands.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("Group by count : "+countByBrand);

	}

}
