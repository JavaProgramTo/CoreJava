package com.javaprogramto.files.printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample2 {

	public static void main(String[] args) {

		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new File("src/main/resources/print_writer/test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.write("First line in file ");
		writer.write("Second line in file");

		writer.flush();

		boolean hasError = writer.checkError();
		System.out.println("any error in storing in file - " + hasError);

		writer.close();
	}
}
