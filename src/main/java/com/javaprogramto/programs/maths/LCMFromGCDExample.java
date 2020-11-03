
package com.javaprogramto.programs.maths;

public class LCMFromGCDExample {

	public static void main(String[] args) {

		printLCMUsingGCD(100, 152);
		printLCMUsingGCD(10, 1100);
		printLCMUsingGCD(140, 300);
	
	}

	private static void printLCMUsingGCD(int a, int b) {
		
		// finding GCD
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}

		int lcm = a * b / gcd;
		System.out.printf("\nThe LCM of two numbers %d and %d is %d.", a, b, lcm);

	}

}
