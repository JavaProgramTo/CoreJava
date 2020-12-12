package com.javaprogramto.java8.dates.milliseconds;

import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * Example to get time in milli seconds in java 8 Using ZonedDateTime and Instant.
 * 
 * @author JavaProgramTo.com
 *
 */
public class MilliSecondsInJava8 {

	public static void main(String[] args) {
		
		// Getting milli seconds from ZonedDateTime class.
		
		// Creating zoned date time
		ZonedDateTime dateTime = ZonedDateTime.now();
		
		// getting the instant from zoned date time
		Instant instant = dateTime.toInstant();
		
		// Converting Instant time to epoch format milli seconds
		long timeInMilliSeconds = instant.toEpochMilli();
		
		// print the output
		System.out.println("Milli seconds from ZonedDateTime : "+timeInMilliSeconds);
		
		// Getting the milli seconds from Instant class.
		// Creating Instant object
		Instant instantTime = Instant.now();
		
		// Getting millis epoch value
		timeInMilliSeconds = instantTime.toEpochMilli();
		
		// printing
		System.out.println("Milli seconds from Instant : "+timeInMilliSeconds);
	}
}
