package com.javaprogramto.programs.arrays.matrix;

public class MatrixMultiplicationFunction {

	public static void main(String[] args) {
		// creating the first matrix using arrays
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// creating the second matrix using two dimension array
		int[][] matrix2 = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

		// Matrix 1 rows and columns length
		int rows1 = matrix1.length;
		int columns1 = matrix1[0].length;

		// Matrix 2 rows and columns length
		int rows2 = matrix2.length;
		int columns2 = matrix2[1].length;

		// output array for storing the multiplication result
		int[][] result = new int[rows1][columns2];

		// Calling a function for matrix multiplication core logic
		doMatricMultiplication(matrix1, matrix2, rows1, columns1, columns2, result);

		// printing the result
		//
		doPrintResultMatric(result);

	}

	/**
	 * Calculates the matrix multiplication for given inputs arrays.
	 * 
	 * @param matrix1
	 * @param matrix2
	 * @param rows1
	 * @param columns1
	 * @param columns2
	 * @param result
	 */
	private static void doMatricMultiplication(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int columns2,
			int[][] result) {

		// matrix addition core logic
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < columns1; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

	}

	// prints the given matrix
	private static void doPrintResultMatric(int[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[1].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
