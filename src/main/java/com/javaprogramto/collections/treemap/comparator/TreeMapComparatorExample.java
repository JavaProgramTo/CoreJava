package com.javaprogramto.collections.treemap.comparator;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparatorExample {

	public static void main(String[] args) {

		Map<String, Integer> designationSalaryInUSD = new TreeMap<>();

		designationSalaryInUSD.put("Software Engineer", 150_000);
		designationSalaryInUSD.put("Senior Software Engineer", 210_000);
		designationSalaryInUSD.put("Manger", 300_000);
		designationSalaryInUSD.put("Lead Engineer", 250_000);

		System.out.println("treemap - " + designationSalaryInUSD);
	}
}
