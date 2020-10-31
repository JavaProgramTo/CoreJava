package com.javaprogramto.programs.large;

public class Largest3NumbersOptimizedExample1 {

	public static void main(String[] args) {

		int number1 = 1000;
		int number2 = 2000;
		int number3 = 300;

		int max = number1;

		if (number1 >= number2 && number1 >= number3) {
			max = number1;
		} else if (number2 >= number3) {
			max = number2;
		} else {
			max = number3;
		}

		System.out.println(max + " is biggest number");
	}

}
