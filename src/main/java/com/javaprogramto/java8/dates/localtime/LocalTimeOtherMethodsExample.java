package com.javaprogramto.java8.dates.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeOtherMethodsExample {
	public static void main(String[] args) {

		// LocalTime object with the current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : " + currentTime);

		LocalTime nextTime = LocalTime.of(12, 59);
		System.out.println("next time : "+nextTime);

		// until() example - to compute the time diff.
		long hours = nextTime.until(currentTime, ChronoUnit.HOURS);
		System.out.println("untill hours : "+hours);
		
		// truncatedTo() example - to get the time limited to a specifed unit of time.
		LocalTime truncatedHours = currentTime.truncatedTo(ChronoUnit.HOURS);
		System.out.println("LocalTime truncated to hours : "+truncatedHours);
		
		// comparing times part
		int isSame = currentTime.compareTo(nextTime);
		
		if(isSame == 0) {
			System.out.println("currentTime and nextTime are same");
		} else {
			System.out.println("currentTime and nextTime are not same");
		}
	
		if(currentTime.isAfter(nextTime)) {
			System.out.println("currentTime is after nextTime");
		} else {
			System.out.println("currentTime is not after nextTime");
		}
		
		if(currentTime.isBefore(nextTime)) {
			System.out.println("currentTime is before nextTime");
		} else {
			System.out.println("currentTime is not before nextTime");
		}
		
	}
}
