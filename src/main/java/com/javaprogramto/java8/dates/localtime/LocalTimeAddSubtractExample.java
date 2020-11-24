package com.javaprogramto.java8.dates.localtime;

import java.time.LocalTime;

public class LocalTimeAddSubtractExample {
	public static void main(String[] args) {

		// LocalTime object with the current time
		LocalTime currentTime = LocalTime.of(10,20,30);
		System.out.println("Current Time : " + currentTime);

		// Adding time to the current time
		LocalTime timeHoursAdded = currentTime.plusHours(1);
		LocalTime timeMinsAdded = currentTime.plusMinutes(10);
		LocalTime timeSecsAdded = currentTime.plusSeconds(60);

		System.out.println("timeHoursAdded : " + timeHoursAdded);
		System.out.println("timeMinsAdded : " + timeMinsAdded);
		System.out.println("timeSecsAdded : " + timeSecsAdded);
		
		// Substracting time to the current time
		LocalTime timeHoursSubstracted = currentTime.minusHours(1);
		LocalTime timeMinsSubstracted = currentTime.minusMinutes(10);
		LocalTime timeSecsSubstracted = currentTime.minusSeconds(60);

		System.out.println("timeHoursSubstracted : " + timeHoursSubstracted);
		System.out.println("timeMinsSubstracted : " + timeMinsSubstracted);
		System.out.println("timeSecsSubstracted : " + timeSecsSubstracted);
		
		
	}
}
