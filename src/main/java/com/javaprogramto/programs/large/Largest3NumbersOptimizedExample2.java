package com.javaprogramto.programs.large;

public class Largest3NumbersOptimizedExample2 {

	public static void main(String[] args) {

		int number1 = -1000;
		int number2 = -2000;
		int number3 = -300;

		int max = number2;

		if (number1 >= number2) {
			max = number1;
		}

		if (number3 >= max) {
			max = number3;
		}

		System.out.println(max + " is biggest number");
	}

}
