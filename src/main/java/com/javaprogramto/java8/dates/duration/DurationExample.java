package com.javaprogramto.java8.dates.duration;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class DurationExample {

	public static void main(String[] args) {

		// creating Instance Objects
		Instant instant1 = Instant.parse("2020-11-30T20:30:40.00Z");
		Instant instant2 = Instant.parse("2020-11-30T20:31:40.00Z");

		// printing instnat objects
		System.out.println("Instant 1: " + instant1);
		System.out.println("Instant 2: " + instant2);

		// getting the time diff
		Duration duration = Duration.between(instant1, instant2);
		System.out.println("Diff between instance1 & instance2 in seconds : " + duration.getSeconds());

		// Diff b/w two LocalTime objects
		int nanos = Duration.between(LocalTime.now(), LocalTime.now()).getNano();
		System.out.println("Time diff in nanos : " + nanos);

		boolean isNegative = duration.isNegative();
		if (isNegative) {
			System.out.println("instant2 is greater than instant1");
		} else {
			System.out.println("instant1 is greater than instant2");
		}

		// Different ways to get Duration objects
		Duration durationDays = Duration.ofDays(2);
		Duration durationHours = Duration.ofHours(10);

		System.out.println("durationDays seconds : " + durationDays.getSeconds());
		System.out.println("durationDays nanos : " + durationDays.getNano());
		System.out.println("durationHours seconds : " + durationHours);
		System.out.println("durationHours seconds : " + durationHours.getSeconds());

		// Creating Duration object from String
		Duration durationParse1 = Duration.parse("PT2H");
		System.out.println("Duration seconds : " + durationParse1.getSeconds());

		Duration durationParse2 = Duration.parse("PT10S");
		System.out.println("Duration seconds : " + durationParse2.getSeconds());
	}
}
