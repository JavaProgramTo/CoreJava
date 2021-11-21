package com.javaprogramto.programs.arrays.matrix.transpose;

public class MatrixTransposeExample3 {

	public static void main(String[] args) {

		int[][] matrix1 = { { 10, 11, 12, 13 }, { 14, 15, 16, 17 }, { 18, 19, 20, 21 } };

		System.out.println("Rectangle matrix");
		printTransposeMatrix(matrix1);

		System.out.println("\nSquered matrix");
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printTransposeMatrix(matrix2);
	}

	private static void printTransposeMatrix(int[][] matrix) {
		int rows = matrix.length, columns = matrix[0].length;
		System.out.println("Original matrix");

		// print matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Logic to the transpose of matrix

		if (rows != columns) {
			int temp = rows;
			rows = columns;
			columns = temp;
		}

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
