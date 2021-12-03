package com.javaprogramto.java8.dates.calendar;

import java.util.Calendar;

public class CalendarAddExample2 {

	public static void main(String[] args) {
		// current calendar date
		Calendar calendar = Calendar.getInstance();

		System.out.println("Current time - " + calendar.getTime());

		calendar.add(Calendar.HOUR, 1);
		System.out.println("adding one hour" + calendar.getTime());

		calendar.add(Calendar.HOUR, -1);
		System.out.println("one hour back time - " + calendar.getTime());

		// future 10 minutes
		calendar.add(Calendar.MINUTE, 10);
		System.out.println("10 minutes future time - " + calendar.getTime());

		// past 10 minutes
		calendar.add(Calendar.MINUTE, -10);
		System.out.println("10 minutes back time - " + calendar.getTime());

	}

}
