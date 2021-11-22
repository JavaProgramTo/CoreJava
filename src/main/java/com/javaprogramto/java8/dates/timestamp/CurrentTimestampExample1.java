package com.javaprogramto.java8.dates.timestamp;

import java.sql.Timestamp;

public class CurrentTimestampExample1 {

	public static void main(String[] args) {

		long timestampInMillies = System.currentTimeMillis();
		
		Timestamp timestamp = new Timestamp(timestampInMillies);
		System.out.println("timestamp now : "+timestamp);
	}

}
