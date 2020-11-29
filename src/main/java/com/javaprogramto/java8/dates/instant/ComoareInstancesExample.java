package com.javaprogramto.java8.dates.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ComoareInstancesExample {
	public static void main(String[] args) {

		// Creating instant object 1
		Instant instant1 = Instant.parse("2020-11-29T13:56:40.11Z");

		// Creating instant object 2
		Instant instant2 = Instant.parse("2022-11-30T13:56:40.11Z");

		// comparing two instants using equals() method
		boolean isEquals = instant1.equals(instant2);
		
		if(isEquals) {
			System.out.println("instant1 & instant2 are same");
		} else {
			System.out.println("instant1 & instant2 are not same");
		}
		
		// comparing Instants using isAfter()
		boolean isAfter = instant1.isAfter(instant2);
		
		if(isAfter) {
			System.out.println("instant1 is after instant2");
		} else {
			System.out.println("instant1 is not after instant2");
		}
		
		// comparing Instants using isBefore()
		boolean isBefore = instant1.isBefore(instant2);
		
		if(isBefore) {
			System.out.println("instant1 is before instant2");
		} else {
			System.out.println("instant1 is not before instant2");
		}
	}
}
