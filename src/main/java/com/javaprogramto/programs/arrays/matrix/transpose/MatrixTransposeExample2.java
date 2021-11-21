package com.javaprogramto.programs.arrays.matrix.transpose;

public class MatrixTransposeExample2 {

	public static void main(String[] args) {

		int[][] matrix = { { 10, 11, 12, 13 }, { 14, 15, 16, 17 }, { 18, 19, 20, 21 } };

		int rows = 3, columns = 4;
		System.out.println("Original matrix");

		// print matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Logic to the transpose of matrix

		int[][] transpose = new int[columns][rows];
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}

		// print transpose matrix
		System.out.println("Transpose of matrix");
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}
