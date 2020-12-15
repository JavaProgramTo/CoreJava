package com.javaprogramto.java8.dates.getdatetime;

import java.sql.Date;

public class SqlDateExample {

	public static void main(String[] args) {
		
		long timeInMillis = System.currentTimeMillis();
		
		Date sqlDate = new Date(timeInMillis);
		
		System.out.println("Current date from sql date : "+sqlDate);
	}
}
