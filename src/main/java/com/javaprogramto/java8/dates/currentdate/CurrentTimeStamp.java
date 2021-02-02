package com.javaprogramto.java8.dates.currentdate;

import java.time.Instant;

public class CurrentTimeStamp {

	public static void main(String[] args) {
		
		// getting the current timestamp from Instant.now() method
		Instant currentInstant = Instant.now();
		
		// getting the current time in milliseoconds from Instant
		long timeInMillis = currentInstant.toEpochMilli();
		
		System.out.println("Current timestamp in milli seconds "+timeInMillis);

		// Getting the current instant in seconds
		long timeInSeconds = currentInstant.getEpochSecond();
		
		System.out.println("Current timestamp in seconds : "+timeInSeconds);
	}
}
