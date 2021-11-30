package com.javaprogramto.files.printwriter;

import java.io.PrintWriter;

public class PrintWriterExample1 {

	public static void main(String[] args) {
		
		PrintWriter writer = new PrintWriter(System.out);
		writer.write("First line of console ");
		writer.write("Second line of console");
		
		writer.flush();
		
		boolean hasError =  writer.checkError();
		System.out.println(" any error in processing - "+hasError);
		
		writer.close();
	}
}
