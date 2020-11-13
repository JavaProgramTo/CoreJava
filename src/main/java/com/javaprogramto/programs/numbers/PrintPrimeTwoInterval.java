package com.javaprogramto.programs.numbers;

public class PrintPrimeTwoInterval {

	public static void main(String[] args) {

		// declaring two integer variables for low and high
		int low = 20;
		int high = 30;

		// run the loop from low to till high
		while (low <= high) {

			// this holds the prime status of current number
			boolean isPrime = true;

			for (int i = 2; i <= low / 2; i++) {

				if (low % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime && low > 1) {
				System.out.print(low + " ");
			}

			// increasing the low by 1 and this is considered as next number
			low++;
		}
	}

}
