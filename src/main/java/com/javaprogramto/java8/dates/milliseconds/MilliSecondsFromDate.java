package com.javaprogramto.java8.dates.milliseconds;

import java.util.Date;

/**
 * Example to get time in milli seconds in java using util Date api
 * 
 * @author JavaProgramTo.com
 *
 */
public class MilliSecondsFromDate {

	public static void main(String[] args) {
		
		// Getting the current date from Date class.
		Date currentDate = new Date();
		
		// Getting the time in milliseconds.
		long milliSeconds = currentDate.getTime();
		
		// printing the values
		System.out.println("Current date : "+currentDate);
		System.out.println("Current date time in milliseconds : "+milliSeconds);
		
		// Creating the future date
		Date futureDate = new Date(2025, 01, 01, 02, 30, 50);
		
		// Getting the future date
		milliSeconds = futureDate.getTime();
		
		// printing the future date time values
		System.out.println("Future date : "+futureDate);
		System.out.println("Future date time in milliseconds : "+milliSeconds);
	}
}
