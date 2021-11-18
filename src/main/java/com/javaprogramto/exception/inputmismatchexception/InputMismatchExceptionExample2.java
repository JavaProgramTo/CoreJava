package com.javaprogramto.exception.inputmismatchexception;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputMismatchExceptionExample2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter BigDecimal array size: ");
		int size = scanner.nextInt();

		BigDecimal[] array = new BigDecimal[size];

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextBigDecimal();
		}
	}
}
