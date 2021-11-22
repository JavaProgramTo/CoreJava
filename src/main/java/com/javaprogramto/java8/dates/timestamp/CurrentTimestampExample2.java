package com.javaprogramto.java8.dates.timestamp;

import java.time.Instant;
import java.util.Date;

public class CurrentTimestampExample2 {

	public static void main(String[] args) {

		Date dateNow = new Date();

		Instant instant = dateNow.toInstant();

		System.out.println("timestamp now : " + instant);
	}

}
