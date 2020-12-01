package com.javaprogramto.java8.dates.timezone.conversion;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class BeforeJava8CalendarZoneConversion {

	public static void main(String[] args) {

		// Creating IST timezone
		TimeZone ist = TimeZone.getTimeZone("Asia/Kolkata");

		// Getting the current date from java.util.Calendar class with IST
		Calendar now = Calendar.getInstance(ist);

		// Date time to current timezone
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm z");
		
		// passing the date from calendar object to formatter.
		String ISTTime = dateFormatter.format(now.getTime());
		System.out.println("IST time : " + ISTTime);

		// Date time to PST
		// Creating PST timezone
		TimeZone pstTimezone = TimeZone.getTimeZone("America/Los_Angeles");
		
		// setting PST timezone to calendar
		now.setTimeZone(pstTimezone);

		// converting IST to PST
		String PSTTime = dateFormatter.format(now.getTime());
		System.out.println("PST time : " + PSTTime);

		// Date time to GST - Dubai Gulf
		// Creating GST timezone
		TimeZone gstTimezone = TimeZone.getTimeZone("Asia/Dubai");
		
		// setting GST timezone to calendar
		now.setTimeZone(gstTimezone);

		// converting IST to PST
		String GSTTime = dateFormatter.format(now.getTime());
		System.out.println("GST time : " + GSTTime);
	}
}
