package com.javaprogramto.java8.integer;

public class IntegerHashcodeExample {

	public static void main(String[] args) {

		Integer unsignedInteger1 = Integer.hashCode(100);
		System.out.println("hashcode integer for 100 is " + unsignedInteger1);

		Integer unsignedInteger2 = Integer.hashCode(200);
		System.out.println("hashcode integer for 4294967196 is " + unsignedInteger2);
	}
}
