package com.javaprogramto.java8.dates.getdatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {

		// current date custom format
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		// current date and time
		Date currentDate = new Date();
		
		// Util Date to String using format()
		String strDate = dateFormatter.format(currentDate);

		System.out.println("Current Date using SimpleDateFormat : "+strDate);
	}
}
