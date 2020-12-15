package com.javaprogramto.java8.dates.getdatetime;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		// using new Date()
		Date currentDateTime = new Date();
		System.out.println("Current date time using Date() : " + currentDateTime);

		// using System.currentTimeMillis()
		long milliSeconds = System.currentTimeMillis();
		currentDateTime = new Date(milliSeconds);
		System.out.println("Current date time using System.currentTimeMillis() : " + currentDateTime);
	}
}
