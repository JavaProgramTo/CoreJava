package com.javaprogramto.files.printwriter.newline;

import java.io.PrintWriter;

public class PrintWriterNewLine {

	public static void main(String[] args) {

		PrintWriter printWriter = new PrintWriter(System.out);

		printWriter.write("this is the first line");
		printWriter.write("\n");
		printWriter.write("this is the second line");
		printWriter.write("\n");
		printWriter.write("third line");

		printWriter.flush();

		printWriter.close();

	}
}
