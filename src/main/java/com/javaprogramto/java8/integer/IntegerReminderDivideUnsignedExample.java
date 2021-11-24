package com.javaprogramto.java8.integer;

public class IntegerReminderDivideUnsignedExample {

	public static void main(String[] args) {

		//divideUnsigned examples
		Integer integer1 = Integer.divideUnsigned(10, 20);
		System.out.println("Result of divide two unsigned values (10, 20) : " + integer1);

		Integer integer2 = Integer.divideUnsigned(20, 10);
		System.out.println("Result of divide two unsigned values (20, 10) : " + integer2);

		Integer integer3 = Integer.divideUnsigned(10, 10);
		System.out.println("Result of divide two unsigned values (10, 10) : " + integer3);
		
		//remainderUnsigned examples
		Integer reminder1 = Integer.remainderUnsigned(10, 20);
		System.out.println("Result of remainder two unsigned values (10, 20) : " + reminder1);

		Integer reminder2 = Integer.remainderUnsigned(20, 10);
		System.out.println("Result of remainder two unsigned values (20, 10) : " + reminder2);

		Integer reminder3 = Integer.remainderUnsigned(10, 10);
		System.out.println("Result of remainder two unsigned values (10, 10) : " + reminder3);
	}
}
