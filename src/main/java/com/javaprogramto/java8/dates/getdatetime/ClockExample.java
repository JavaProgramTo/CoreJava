package com.javaprogramto.java8.dates.getdatetime;

import java.time.Clock;
import java.time.Instant;

public class ClockExample {

	public static void main(String[] args) {
		Clock clockInUTC = Clock.systemUTC();
		Instant instnat = clockInUTC.instant();
		
		System.out.println("Java 8 - Current date time : "+instnat);
	}
}
