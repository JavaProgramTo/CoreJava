package com.javaprogramto.programs.escape.sequences;

public class EscapeSequencesExample1 {

	public static void main(String[] args) {
		
		String newLineEscapeSequence1 = "\n";
		System.out.println("\\n length is "+newLineEscapeSequence1.length());
		

		String newLineEscapeSequence2 = "\n\n";
		System.out.println("\\n\\n length is "+newLineEscapeSequence2.length());
		

		String tabEscapeSequence1 = "\t";
		System.out.println("\\t length is "+tabEscapeSequence1.length());
		

		String backslashEscapeSequence1 = "\\";
		System.out.println("\\\\ length is "+backslashEscapeSequence1.length());

	}
}
