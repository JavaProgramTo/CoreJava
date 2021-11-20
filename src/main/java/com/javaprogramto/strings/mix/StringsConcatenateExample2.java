package com.javaprogramto.strings.mix;

public class StringsConcatenateExample2 {

	public static void main(String[] args) {

		String s1 = new String("JavaProgramTo.com");
		String s2 = "welcome, Java developer";

		String s3 = s1.concat(s2);
		System.out.println("Mixed string 1 using concat() :: " + s3);

		String s4 = "this is a ".concat("new string");
		System.out.println("Mixed string 2 using concat() : : " + s4);
	}
}
