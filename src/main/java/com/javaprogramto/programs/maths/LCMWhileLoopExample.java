package com.javaprogramto.programs.maths;

public class LCMWhileLoopExample {

	public static void main(String[] args) {

		// creating a two integer variables
		int a = 100;
		int b = 152;

		// Example 1
		printLCM(a, b);

		// Example 2
		a = 100;
		b = 200;

		printLCM(a, b);

		// Example 3
		a = 82;
		b = 205;

		printLCM(a, b);

	}

	private static void printLCM(int a, int b) {
		// taking big number as lcm default.

		int lcm = b;
		if (a > b) {
			lcm = a;
		}

		while (true) {

			if (lcm % a == 0 && lcm % b == 0) {
				System.out.printf("\nThe LCM of two numbers %d and %d is %d.", a, b, lcm);
				break;
			}

			lcm++;
		}

	}

}
