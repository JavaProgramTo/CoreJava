package com.javaprogramto.java8.dates.timezone.conversion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class BeforeJava8DateTimeZoneConversion {

	public static void main(String[] args) {

		// Getting the current date from java.util.Date class
		Date currentTime = new Date();

		// Date time to current timezone
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm z");
		String ISTTime = dateFormatter.format(currentTime);
		System.out.println("IST time : " + ISTTime);

		// Date time to PST
		// Creating PST timezone
		TimeZone pstTimezone = TimeZone.getTimeZone("America/Los_Angeles");

		// setting pst timezone to formatter.
		dateFormatter.setTimeZone(pstTimezone);

		// converting IST to PST
		String PSTTime = dateFormatter.format(currentTime);
		System.out.println("PST time : " + PSTTime);

		// Date time to GST - Dubai Gulf
		// Creating GST timezone
		TimeZone gstTimezone = TimeZone.getTimeZone("Asia/Dubai");

		// setting pst timezone to formatter.
		dateFormatter.setTimeZone(gstTimezone);

		// converting IST to PST
		String GSTTime = dateFormatter.format(currentTime);
		System.out.println("GST time : " + GSTTime);
	}
}
