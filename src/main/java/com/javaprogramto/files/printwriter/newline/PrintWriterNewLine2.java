package com.javaprogramto.files.printwriter.newline;

import java.io.PrintWriter;

public class PrintWriterNewLine2 {

	public static void main(String[] args) {

		PrintWriter printWriter = new PrintWriter(System.out);

		printWriter.println("this is the first line");
		printWriter.println("this is the second line");
		printWriter.println("third line");

		printWriter.flush();

		printWriter.close();

	}
}
