package com.javaprogramto.java8.dates.milliseconds;

import java.util.Calendar;
import java.util.Locale;

/**
 * Example to get time in milli seconds in java using Calendar api
 * 
 * @author JavaProgramTo.com
 *
 */
public class MilliSecondsFromCalendar {

	public static void main(String[] args) {
		
		// Getting the current date from Calendar class.
		Calendar calendar = Calendar.getInstance();
		
		// Getting the time in milliseconds.
		long milliSeconds = calendar.getTimeInMillis();
		
		// printing the values
		System.out.println("Current calender time in milliseconds : "+milliSeconds);
		
		// Creating another calendar object for Canada locale
		Calendar canadaLocale = Calendar.getInstance(Locale.CANADA);
		
		// Getting the future date
		milliSeconds = canadaLocale.getTimeInMillis();
		
		// printing the future date time values
		System.out.println("Future date time in milliseconds : "+milliSeconds);
	}
}
