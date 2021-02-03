package com.javaprogramto.java8.collectors.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByCountObjects {

	public static void main(String[] args) {

		// Creating List and adding duplicate values.
		List<Stock> stocks = new ArrayList<>();

		stocks.add(new Stock("JP Morgan", 10));
		stocks.add(new Stock("ICICI", 10));
		stocks.add(new Stock("HDFC", 10));
		stocks.add(new Stock("ICICI", 10));
		stocks.add(new Stock("JP Morgan", 10));
		stocks.add(new Stock("JP Morgan", 10));

		// group by - stock name + sum(quanity)

		Map<String, Integer> noOfStocksByName = stocks.stream()
				.collect(Collectors.groupingBy(Stock::getName, Collectors.summingInt(Stock::getQuantity)));

		// printing the count of each string.
		System.out.println("No of stocks by stock name : " + noOfStocksByName);
	}
}
