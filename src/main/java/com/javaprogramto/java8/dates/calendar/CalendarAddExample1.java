package com.javaprogramto.java8.dates.calendar;

import java.util.Calendar;

public class CalendarAddExample1 {

	public static void main(String[] args) {
		// current calendar date
		Calendar calendar = Calendar.getInstance();

		System.out.println("Current time - " + calendar.getTime());

		// Adding 10 days to get the future date
		calendar.add(Calendar.DATE, 10);
		System.out.println("10 days future time - " + calendar.getTime());

		// 10 days old date to get the past date
		calendar.add(Calendar.DATE, -10);
		System.out.println("10 days past time - " + calendar.getTime());

		// future 10 years
		calendar.add(Calendar.YEAR, 10);
		System.out.println("10 years future time - " + calendar.getTime());

		// past 10 years
		calendar.add(Calendar.YEAR, -10);
		System.out.println("10 years back time - " + calendar.getTime());

		// future 10 months
		calendar.add(Calendar.MONTH, 10);
		System.out.println("10 months future time - " + calendar.getTime());

		// past 10 months
		calendar.add(Calendar.MONTH, -10);
		System.out.println("10 months back time - " + calendar.getTime());

	}

}
