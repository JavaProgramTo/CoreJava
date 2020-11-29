package com.javaprogramto.java8.dates.instant;

import java.time.Instant;

public class InstantParseExample {
	public static void main(String[] args) {

		// Creating instant object from parse()
		Instant instantFromStr1 = Instant.parse("2020-11-29T13:35:30.01Z");
		System.out.println("Instant 1 from string using parse() : " + instantFromStr1);

		Instant instantFromStr2 = Instant.parse("2020-12-29T13:35:31.00Z");
		System.out.println("Instant 2 from string using parse() : " + instantFromStr2);
	}
}
