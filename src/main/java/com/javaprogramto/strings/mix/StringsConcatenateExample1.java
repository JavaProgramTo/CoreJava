package com.javaprogramto.strings.mix;

public class StringsConcatenateExample1 {

	public static void main(String[] args) {
		
		String s1 = new String("JavaProgramTo.com");
		String s2 = "welcome, Java developer";
		
		String s3 = s1 + s2;
		System.out.println("Mixed string 1 : "+s3);
		
		String s4 = "this is a " + "new string";
		System.out.println("Mixed string 2 : "+s4);	
	}
}
