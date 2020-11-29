package com.javaprogramto.java8.dates.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantMinusExample {
	public static void main(String[] args) {

		// Creating instant object from string using parse()
		Instant instant1 = Instant.parse("2020-11-29T13:56:40.11Z");

		// Removing 60 seconds
		Instant addedSeconds = instant1.minus(60l, ChronoUnit.SECONDS);
		System.out.println("Minus 60 seconds : " + addedSeconds);

		// Another example to add 60 minutes
		Instant instant2 = Instant.parse("2020-11-29T13:56:40.11Z");

		// Subtracting 60 minutes
		Instant addedMinutes = instant2.minus(60l, ChronoUnit.MINUTES);
		System.out.println("Minus 60 Minutues : " + addedMinutes);
	}
}
