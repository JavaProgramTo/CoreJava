package com.javaprogramto.java8.integer;

public class IntegerToUnsignedStringExample {

	public static void main(String[] args) {

		String unsignedString1 = Integer.toUnsignedString(100);
		System.out.println("Unsigned decimal string for 100 is "+unsignedString1);
		
		String unsignedString2 = Integer.toUnsignedString(-100);
		System.out.println("Unsigned decimal string for -100 is "+unsignedString2);

		String unsignedString3 = Integer.toUnsignedString(-10000000);
		System.out.println("Unsigned decimal string for -10000000 is "+unsignedString3);
		
		String unsignedString4 = Integer.toUnsignedString(8, 2);
		System.out.println("Unsigned binary string for 8 is "+unsignedString4);
		
		String unsignedString5 = Integer.toUnsignedString(15, 2);
		System.out.println("Unsigned binary string for 15 is "+unsignedString5);
		
		String unsignedString6 = Integer.toUnsignedString(32, 16);
		System.out.println("Unsigned octa string for 32 is "+unsignedString6);		
		
	}
}
