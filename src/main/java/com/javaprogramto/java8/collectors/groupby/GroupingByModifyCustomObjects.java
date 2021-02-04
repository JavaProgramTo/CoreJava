package com.javaprogramto.java8.collectors.groupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupingByModifyCustomObjects {

	public static void main(String[] args) {

		// Creating List and adding duplicate values.
		List<Trade> Trades = new ArrayList<>();

		Trades.add(new Trade("JP Morgan", 10));
		Trades.add(new Trade("ICICI", 20));
		Trades.add(new Trade("HDFC", 30));
		Trades.add(new Trade("ICICI", 40));
		Trades.add(new Trade("JP Morgan", 50));
		Trades.add(new Trade("JP Morgan", 60));

		// group by - Trade name + List<Integer> list of Quantity's

		Map<String, List<Integer>> noOfTradesByName 
			= Trades
				.stream()
				.collect(Collectors
				.groupingBy(Trade::getName, 
						Collectors.mapping(Trade::getQuantity, Collectors.toList())));

		// printing the count of each string.
		System.out.println("No of stocks by name in each trade: " + noOfTradesByName);
	}
}
