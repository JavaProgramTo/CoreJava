package com.javaprogramto.programs.fizzbuzz;

/**
 * Java program to implement fizz buzz solution
 * @author javaprogramto.com
 *
 */
public class FizzBuzzExample {

	public static void main(String[] args) {
		
		// limit the fizz buzz game
		int limit = 100;
		
		// staring number
		int currentNumber = 1;
		
		// running the while loop till it reaches the max limit
		while (currentNumber <= limit) {
			
			// checking for fizzbuzz
			if (currentNumber % 5 == 0 && currentNumber % 7 == 0) {
				System.out.println("FizzBuzz");

				// checking for fizz
			} else if (currentNumber % 5 == 0) {
				System.out.println("Fizz");
				
				// checking for buzz
			} else if (currentNumber % 7 == 0 ) {
				System.out.println("Buzz");
			}  else {
				System.out.println(currentNumber);
			}
			
			// incrementing the number by 1
			currentNumber++;
		}
	}
}
