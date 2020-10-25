package com.javaprogramto.programs.arrays.matrix;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// creating the first matrix using arrays
		int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// creating the second matrix using two dimension array
		int[][] matrix2 = { { 1, 1 }, { 1, 1 }, { 1, 1 } };

		// Matrix 1 rows and columns length
		int rows1 = matrix1.length;
		int columns1 = matrix1[0].length;
		
		// Matrix 2 rows and columns length
		int rows2 = matrix2.length;
		int columns2 = matrix2[1].length;

		// output array for storing the multiplication result
		int[][] result = new int[rows1][columns2];

		// matrix addition core logic
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < columns1; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
			}
		}

		// printing the result
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[1].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
