package com.javaprogramto.java8.dates.localtime;

import java.time.LocalTime;

public class LocalTimeTimezoneExample {
	public static void main(String[] args) {

		// Getting time parts from LocalTime object

		LocalTime time = LocalTime.now();
		
		
		// Example 1 : Using now() method
		LocalTime time1 = LocalTime.now();
		System.out.println("Time 1 using now() : " + time1);

		// Example 2 : Using of() method
		LocalTime time2 = LocalTime.of(20, 20, 20);
		System.out.println("Time 2 using of() : " + time2);

		// Example 3 : Using of() method
		LocalTime time3 = LocalTime.of(3, 30);
		System.out.println("Time 3 using of() : " + time3);
	}
}
