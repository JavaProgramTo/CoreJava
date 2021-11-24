package com.javaprogramto.java8.integer;

public class IntegerCompareUnsignedExample {

	public static void main(String[] args) {

		Integer integer1 = Integer.compareUnsigned(10, 20);
		System.out.println("Result of comparing two unsigned values (10, 20) : " + integer1);

		Integer integer2 = Integer.compareUnsigned(20, 10);
		System.out.println("Result of comparing two unsigned values (20, 10) : " + integer2);
		
		Integer integer3 = Integer.compareUnsigned(10, 10);
		System.out.println("Result of comparing two unsigned values (10, 10) : " + integer3);
	}
}
