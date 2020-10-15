package com.javaprogramto.programs.arrays.calculation;

public class StandardDeviation {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		double standardDeviation = calculateStandardDeviation(array);

		System.out.format("Standard deviation : %.6f", standardDeviation);

	}

	private static double calculateStandardDeviation(int[] array) {

		// finding the sum of array values
		double sum = 0.0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		// getting the mean of array.
		double mean = sum / array.length;

		// calculating the standard deviation
		double standardDeviation = 0.0;
		for (int i = 0; i < array.length; i++) {
			standardDeviation += Math.pow(array[i] - mean, 2);

		}

		return Math.sqrt(standardDeviation/array.length);
	}

}
