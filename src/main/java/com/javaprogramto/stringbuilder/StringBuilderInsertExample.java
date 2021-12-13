package com.javaprogramto.stringbuilder;

import com.javaprogramto.models.Employee;

public class StringBuilderInsertExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("first line   end");

		// adding boolean to the string builder
		sb.insert(10, true);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding char to the string builder
		sb.insert(10, 'A');
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding char array to the string builder
		char[] charArray = { 'B', 'C' };
		sb.insert(10, charArray);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding char array to the string builder
		char[] charArray2 = { 'F', 'D', 'G', 'H' };
		sb.insert(10, charArray2, 1, 2);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding double to the string builder
		double d = 1000;
		sb.insert(10, d);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding int to the string builder
		int i = 1001;
		sb.insert(10, 1);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding float to the string builder
		float f = 1000.009f;
		sb.insert(10, f);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding long to the string builder
		long l = 1000;
		sb.insert(10, l);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding StringBuffer to the string builder
		StringBuffer buffer = new StringBuffer("hello");
		sb.insert(10, buffer);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding StringBuffer to the string builder
		StringBuffer buffer2 = new StringBuffer("welcome ");
		sb.insert(10, buffer2, 3, 5);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding StringBuffer to the string builder
		String str = "string";
		sb.insert(10, str);
		sb.insert(10, " ");
		System.out.println(sb.toString());

		// adding StringBuffer to the string builder
		Employee e = new Employee(100, "name", 50);
		sb.insert(10, e);
		sb.insert(10, " ");
		System.out.println(sb.toString());

	}

}
