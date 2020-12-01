package com.javaprogramto.java8.dates.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTIme24HoursExample {

	public static void main(String[] args) {

		// Getting the current date and time
		Date currentDate = new Date();
		
		// Creating simple date formatter to 24 hours
		SimpleDateFormat formatter = new SimpleDateFormat("kk:mm:ss");
		
		// getting the time in 24 hours format
		String timeIn24Hours = formatter.format(currentDate);
		
		// printing the time
		System.out.println("Current time in 24 hours : "+timeIn24Hours);
	}
}
