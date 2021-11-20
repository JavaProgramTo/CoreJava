package com.javaprogramto.strings.mix;

public class StringsConcatenateExample3 {

	public static void main(String[] args) {

		String s1 = new String("JavaProgramTo.com");
		String s2 = "welcome, Java developer";

		StringBuffer buffer = new StringBuffer();
		buffer.append(s1);
		buffer.append(s2);
		String s3 = buffer.toString();

		System.out.println("Mixed string 1 using StringBuffer : " + s3);

		StringBuilder builder = new StringBuilder();
		builder.append("this is a ");
		builder.append("new string");
		String s4 = builder.toString();

		System.out.println("Mixed string 2 using StringBuilder : " + s4);
	}
}