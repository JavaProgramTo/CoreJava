package com.javaprogramto.java8.dates.instant;

import java.time.Instant;

public class InstantEpochSecondExample {
	public static void main(String[] args) {

		// Creating instant object from ofEpochMilli()
		Instant instantFromEpochSecond1 = Instant.ofEpochMilli(1606657474l);
		System.out.println("Instant 1 from Epoch Second value using  ofEpochMilli() : " + instantFromEpochSecond1);

		Instant instantFromEpochSecond2 = Instant.ofEpochMilli(1667137474l);
		System.out.println("Instant 2 from Epoch Second value using  ofEpochMilli() : " + instantFromEpochSecond2);
	}
}
