package com.javaprogramto.files.printwriter.tofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterToFileExample2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("src/main/resources/print_writer/file/test2.txt");
		
		PrintWriter writer = new PrintWriter(file);
		
		writer.println("Line 1");
		writer.println("Line 2");
		writer.println("Line 3");
		
		writer.flush();
		
		writer.close();
		System.out.println("Done");

	}

}
