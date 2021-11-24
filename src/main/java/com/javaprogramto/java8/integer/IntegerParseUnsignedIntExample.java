package com.javaprogramto.java8.integer;

public class IntegerParseUnsignedIntExample {

	public static void main(String[] args) {

		Integer unsignedInteger1 = Integer.parseUnsignedInt("100");
		System.out.println("Unsigned decimal integer for 100 is " + unsignedInteger1);

		Integer unsignedInteger2 = Integer.parseUnsignedInt("4294967196");
		System.out.println("Unsigned decimal integer for 4294967196 is " + unsignedInteger2);

		Integer unsignedString4 = Integer.parseUnsignedInt("10", 2);
		System.out.println("Unsigned binary integer for 8 is " + unsignedString4);

		Integer unsignedString5 = Integer.parseUnsignedInt("111", 2);
		System.out.println("Unsigned binary integer for 15 is " + unsignedString5);

		Integer unsignedString6 = Integer.parseUnsignedInt("20", 16);
		System.out.println("Unsigned octa integer for 32 is " + unsignedString6);

	}
}
