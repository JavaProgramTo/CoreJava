package com.javaprogramto.arrays.multidimensional;

public class NestedArraysExample3 {

	public static void main(String[] args) {

		// Assigning values when array is getting created
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// Create an array first and then next assing values using for loop.
		int[][] array2 = new int[5][5];
		int count = 1;
		for (int i = 0; i < array2.length; i++) {

			for (int j = 0; j < array2[0].length; j++) {
				array2[i][j] = count;
				count++;
			}
		}

		System.out.println("2D array values by index");
		System.out.println("array1[1][1] - "+array1[1][1]);
		System.out.println("array2[2][2] - "+array2[2][2]);
		
		System.out.println("array1 full valus");
		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array1[0].length; j++) {
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}

	}
}
