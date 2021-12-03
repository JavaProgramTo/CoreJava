package com.javaprogramto.programs.escape.newline;

public class AddNewLineExample3 {

	public static void main(String[] args) {
		
		// old mac os based
		String line1 = "Hello engeers";
		String line2 = "hope you are staying safe";
		
		String line3 = line1 + "\r" + line2;
		
		System.out.println("Old mac os print newline with \\r");
		System.out.println(line3);
	}
}
