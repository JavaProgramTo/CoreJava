package com.javaprogramto.java8.dates.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantPlusExample {
	public static void main(String[] args) {

		// Creating instant object from string using parse()
		Instant instant1 = Instant.parse("2020-11-29T13:56:40.11Z");

		// Adding 60 seconds
		Instant addedSeconds = instant1.plus(60l, ChronoUnit.SECONDS);
		System.out.println("Added 60 seconds : " + addedSeconds);

		// Another example to add 60 minutes
		Instant instant2 = Instant.parse("2020-11-29T13:56:40.11Z");

		// Adding 60 minutes
		Instant addedMinutes = instant2.plus(60l, ChronoUnit.MINUTES);
		System.out.println("Added 60 Minutues : " + addedMinutes);
	}
}
