package com.javaprogramto.chars;

public class AddCharToStringExample3 {

	public static void main(String[] args) {

		System.out.println("Single character");

		StringBuffer singleCharBuffer = new StringBuffer();
		singleCharBuffer.append('A').append("hello");
		String singleCharStr = singleCharBuffer.toString();
		System.out.println("start of the string : "+singleCharStr);
		

		StringBuffer singleCharBuffer2 = new StringBuffer();
		singleCharBuffer2.append("hello").append('A');
		String singleCharStr2 = singleCharBuffer2.toString();
		System.out.println("at end of the string : "+singleCharStr2);
		
		System.out.println("Multiple characters");

		StringBuffer singleCharBuffer3 = new StringBuffer();
		singleCharBuffer3.append('A').append('B').append("hello");
		String singleCharStr3 = singleCharBuffer3.toString();
		System.out.println("start of the string : "+singleCharStr3);
		
		StringBuffer singleCharBuffer4 = new StringBuffer();
		singleCharBuffer4.append("hello").append('A').append('B');
		String singleCharStr4 = singleCharBuffer4.toString();
		System.out.println("at end of the string : "+singleCharStr4);
	}
}
