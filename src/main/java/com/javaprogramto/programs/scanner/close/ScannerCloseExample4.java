package com.javaprogramto.programs.scanner.close;

import java.util.Scanner;

public class ScannerCloseExample4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your birth year");
		int year = scanner.nextInt();

		System.out.println("Enter your age ");
		int age = scanner.nextInt();

		scanner.close();

		System.out.println("Given age and year are (" + age + "," + year + ")");
		
		System.out.println("Enter your name ");
		String name = scanner.next();
	}
}
