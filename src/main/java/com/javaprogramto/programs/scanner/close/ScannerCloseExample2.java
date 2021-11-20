package com.javaprogramto.programs.scanner.close;

import java.util.Scanner;

public class ScannerCloseExample2 {

	public static void main(String[] args) {

		String multiLinesSeparator = "Line 1 \n Line 2 \n Line 3";
		Scanner scanner = new Scanner(multiLinesSeparator);

		try {

			String firstLine = scanner.nextLine();
			String secondLine = scanner.nextLine();
			String thirdLine = scanner.nextLine();

			System.out.println(
					"Info from string via scanner are (" + firstLine + ", " + secondLine + ", " + thirdLine + ")");

			thirdLine.charAt(100);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			System.out.println("scanner is closed");
		}

	}
}
