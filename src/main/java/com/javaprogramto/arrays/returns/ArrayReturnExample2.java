package com.javaprogramto.arrays.returns;

import java.util.Arrays;

public class ArrayReturnExample2 {

	public static void main(String[] args) {

		double[] first5Numbers = getDoublePRimitive(5);

		System.out.println("Double primitive Array returned from method : " + Arrays.toString(first5Numbers));

		Double[] first6Numbers = getDoubleWrapper(6);

		System.out.println("Double wrapper Array returned from method : " + Arrays.toString(first6Numbers));

	}

	// returning double primitive array from method
	public static double[] getDoublePRimitive(int size) {

		double[] numbers = new double[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = i + 1;
		}

		return numbers;
	}

	// returning Double wrapper array from method
	public static Double[] getDoubleWrapper(int size) {

		Double[] numbers = new Double[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = Double.valueOf(i + 1);
		}

		return numbers;
	}
}
