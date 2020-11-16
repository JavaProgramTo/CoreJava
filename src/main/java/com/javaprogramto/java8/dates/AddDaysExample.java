package com.javaprogramto.java8.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDaysExample {
	public static void main(String[] args) {
		// creating date in java
		Date date = new Date();
		
		// printing the date in the readable format.
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = dateFormat.format(date);
		System.out.println("Current date : "+dateStr);
		
		//creating calender instance 
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		// adding 2 years, months and date
		calendar.add(Calendar.YEAR, 2);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DATE, 2);
		
		// getting the new date from calendar
		Date addedDate = calendar.getTime();
		
		// printing the new date
		String newDateinStr = dateFormat.format(addedDate);
		System.out.println("New date after adding 10 years : "+newDateinStr);
		
	}
}
