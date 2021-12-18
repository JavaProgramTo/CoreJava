package com.javaprogramto.keywords.finals;

public class FInalVaraibleExamples4 {

	public static void main(String[] args) {

		final StringBuffer sb = new StringBuffer("hello");
		
		sb.append(" world");
		
		System.out.println("sb value - "+sb.toString());
		
		//sb = new StringBuffer(); // compile time error
	}

}
