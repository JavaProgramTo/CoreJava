package com.javaprogramto.arrays.multidimensional;

public class NestedArraysExample4 {

	public static void main(String[] args) {

		double[][][][] array = new double[12][10][2][2];

		// Assigning values when array is getting created
		int[][][] array1 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 6, 7, 8 }, { 9, 10, 11 } } };

		// Create an array first and then next assign values using for loop.
		int[][][] array2 = new int[5][5][5];
		int count = 1;
		for (int i = 0; i < array2.length; i++) {

			for (int j = 0; j < array2[0].length; j++) {
				for (int k = 0; k < array2[0][0].length; k++) {
					array2[i][j][k] = count;
					count++;
				}
			}

		}

		System.out.println("3D array values by index");
		System.out.println("array1[1][1] - " + array1[1][1][1]);
		System.out.println("array2[2][2] - " + array2[2][2][2]);

		System.out.println("\n3D array1 full values");
		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array1[0].length; j++) {
				System.out.print("{ ");
				for (int k = 0; k < array1[0][0].length; k++) {
					System.out.print(array1[i][j][k] + " ");
				}
				System.out.print(" }");
			}
			System.out.println();

		}

	}
}
