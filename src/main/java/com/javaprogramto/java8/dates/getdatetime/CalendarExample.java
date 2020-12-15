package com.javaprogramto.java8.dates.getdatetime;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		
		// Getting the calendar object
		Calendar cal = Calendar.getInstance();

		// Getting the util Date.
		Date currentDateTime = cal.getTime();
		System.out.println("Current Date Time : "+currentDateTime);
	}
}
