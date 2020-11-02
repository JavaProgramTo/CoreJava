package com.javaprogramto.programs;

public class MultiplicationTableWhileLoop {

	public static void main(String[] args) {
		int tableNumber = 5;

		System.out.println("Generating the table 9");
		int tableStartIndex = 1;
		int tableEndIndex = 10;
		// generating table 10
		while (tableStartIndex <= tableEndIndex) {

			System.out.format("%d * %d = %d \n", tableNumber, tableStartIndex, tableNumber * tableStartIndex);
			tableStartIndex++;
		}

		// generating the 20 table.
		System.out.println("\nGenerating the table 18");

		// resetting the start and end index
		tableStartIndex = 1;
		tableEndIndex = 10;
		int anotherTableNumber = 18;
		while (tableStartIndex <= tableEndIndex) {

			System.out.format("%d * %d = %d \n", anotherTableNumber, tableStartIndex, tableNumber * tableStartIndex);
			tableStartIndex++;
		}

	}

}
