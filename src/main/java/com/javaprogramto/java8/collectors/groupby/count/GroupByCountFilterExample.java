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

public class GroupByCountFilterExample {

	public static void main(String[] args) {

		List<String> modelNames = new ArrayList<>();

		// adding the model names to the list
		modelNames.add("Apple iphone 12");
		modelNames.add("Google Pixel 5");
		modelNames.add("Nokia 3.1 plus");
		modelNames.add("HTC Desire 21 Pro 5G");
		modelNames.add("HTC Wildfire E1");
		modelNames.add("Google Pixel");
		modelNames.add("Google nexus 6p");
		modelNames.add("Google nexus");
		modelNames.add("Apple iphone 5");
		modelNames.add("Apple iphone 3s");
		modelNames.add("Apple iphone 12 max");

		Map<String, Long> countByBrand = modelNames.stream()
				.map(model -> model.split(" ")[0]).filter(brandName -> !brandName.equalsIgnoreCase("HTC") )
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Group by brands count : " + countByBrand);
		
		// output: Group by brands count : {Google=4, Apple=4, Nokia=1}


	}

}
