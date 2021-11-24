package com.javaprogramto.java8.integer;

public class IntegerToUnsignedLongExample {

	public static void main(String[] args) {

		Long long1 = Integer.toUnsignedLong(10);
		System.out.println("unsigned long value for int 10 is " + long1);

		Long long2 = Integer.toUnsignedLong(4294967);
		System.out.println("unsigned long value for int 4294967 is " + long2);
		
		Long long3 = Integer.toUnsignedLong(100000);
		System.out.println("unsigned long value for int 10 is " + long3);
	}
}
