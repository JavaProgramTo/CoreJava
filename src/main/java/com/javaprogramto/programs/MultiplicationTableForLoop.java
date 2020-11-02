package com.javaprogramto.programs;

public class MultiplicationTableForLoop {

	public static void main(String[] args) {
		int tableNumber = 10;

		System.out.println("Generating the table 10");
		// generating table 10
		for (int i = 1; i <= 10; i++) {

			System.out.format("%d * %d = %d \n", tableNumber, i, tableNumber * i);

		}

		// generating the 20 table.
		System.out.println("\nGenerating the table 20");
		int anotherTableNumber = 20;
		for (int i = 1; i <= 10; i++) {

			System.out.format("%d * %d = %d \n", anotherTableNumber, i, anotherTableNumber * i);

		}

	}

}
