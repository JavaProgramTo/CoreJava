package com.javaprogramto.java8.dates;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.joda.time.DateTime;

/**
 * Example to get the current time in milli seconds.
 * 
 * @author JavaProgramTo.com
 *
 */
public class CurrentTimeSystemCurrentTimeMillis {

	public static void main(String[] args) {

		// calling currentTimeMillis() method
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("Current time in millies - "+currentTimeMillis);
		
		// using Date(long) constructor
		Date date = new Date(currentTimeMillis);
		System.out.println("Date : "+date);
		
		// java 8
		LocalDateTime localDateTime = Instant.ofEpochMilli(currentTimeMillis).atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("Java 8 localdate time : "+localDateTime);
	}
}
