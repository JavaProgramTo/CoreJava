package com.javaprogramto.programs.escape.sequences;

public class EscapeSequencesExample2 {

	public static void main(String[] args) {

		// octal escape sequence examples
		String octalEscape1 = "\52";

		System.out.println("\\52 octal represntation is " + octalEscape1);

		String octalEscape2 = "\53";

		System.out.println("\\53 octal represntation is " + octalEscape2);
		
		// unicode escape sequence examples

		String unicodeEscape1 = "\u5222";

		System.out.println("\\u5222 unicode represntation is " + unicodeEscape1);

		String unicodeEscape2 = "\u5333";

		System.out.println("\\u5333 unicode represntation is " + unicodeEscape2);
	}
}
