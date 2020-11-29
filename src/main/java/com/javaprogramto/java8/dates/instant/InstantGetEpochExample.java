package com.javaprogramto.java8.dates.instant;

import java.time.Instant;

public class InstantGetEpochExample {
	public static void main(String[] args) {

		// Creating instant object from now()
		Instant instant1 = Instant.now();
		
		// Getting long value in epoch style from instant object
		long epoch1 = instant1.getEpochSecond();
		System.out.println("Instant 1 "+instant1);
		System.out.println("epoch 1 "+epoch1);

		// Another example to get the epoch value
		Instant instant2 = Instant.now();
		long epoch2 = instant2.getEpochSecond();
		System.out.println("Instant 2 "+instant2);
		System.out.println("epoch 2 "+epoch2);
	}
}
