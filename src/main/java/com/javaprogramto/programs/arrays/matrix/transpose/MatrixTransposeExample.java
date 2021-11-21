package com.javaprogramto.programs.arrays.matrix.transpose;

public class MatrixTransposeExample {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = 3, columns = 3;
		System.out.println("Original matrix");

		// print matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Logic to the transpose of matrix

		int[][] transpose = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		
		// print transpose matrix
		System.out.println("Transpose of matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}
