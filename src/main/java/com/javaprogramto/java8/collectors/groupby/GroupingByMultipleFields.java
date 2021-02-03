package com.javaprogramto.java8.collectors.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMultipleFields {

	public static void main(String[] args) {

		// Creating List and adding duplicate values.
		List<Stock> stocks = new ArrayList<>();

		stocks.add(new Stock("JP Morgan", 10, 100));
		stocks.add(new Stock("ICICI", 20, 100));
		stocks.add(new Stock("HDFC", 30, 300));
		stocks.add(new Stock("ICICI", 20, 200));
		stocks.add(new Stock("JP Morgan", 10, 100));
		stocks.add(new Stock("JP Morgan", 10, 100));

		// group by - stock name + quanity

		Map<String, Map<Integer, Long>> noOfStocksByName = stocks.stream()
				.collect(Collectors.groupingBy(Stock::getName, Collectors.groupingBy(Stock::getQuantity, Collectors.counting())));

		// printing the count of each string.
		System.out.println("Group by on multiple properties" + noOfStocksByName);
	}
}
