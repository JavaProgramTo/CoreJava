package com.javaprogramto.programs.arrays.matrix;

public class MatrixTranspose {

	public static void main(String[] args) {
		// creating the first matrix using arrays
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		//Printing the original matrix
		System.out.println("Input Matrix : ");
		doPrintResultMatric(matrix);
		
		// Matrix 1 rows and columns length
		int rows = matrix.length;
		int columns = matrix[0].length;

		// Calling a function for matrix transpose core logic
		int[][] result = doMatricTranspose(matrix, rows, columns);

		// printing the result
		System.out.println("Transpose of Matrix : ");
		doPrintResultMatric(result);

	}

	/**
	 * Calculates the matrix transpose for given inputs arrays.
	 * 
	 * @param matrix1
	 * @param rows1
	 * @param columns1
	 * @return
	 */
	private static int[][] doMatricTranspose(int[][] matrix, int rows, int columns) {

		// output array for storing the transpose result. order needs to be swapped.
		int[][] result = new int[columns][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[j][i] = matrix[i][j];
			}
		}

		return result;
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
