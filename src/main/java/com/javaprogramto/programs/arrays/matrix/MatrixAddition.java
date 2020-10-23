package com.javaprogramto.programs.arrays.matrix;

public class MatrixAddition {

	public static void main(String[] args) {
		// creating the first matric using arrays
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// creating the second matrix using two dimension array
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// output array for storing the addition result
		int rows = matrix1.length;
		int columns = matrix2[1].length;
		int[][] output = new int[rows][columns];

		// matrix addition core logic
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				output[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// printing the result
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[1].length; j++) {
				System.out.print(output[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
