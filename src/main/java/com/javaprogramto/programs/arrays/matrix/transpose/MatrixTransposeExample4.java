package com.javaprogramto.programs.arrays.matrix.transpose;

public class MatrixTransposeExample4 {

	public static void main(String[] args) {

		System.out.println("\nSquered matrix");
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		inplaceTransposeMatrix(matrix2);
	}

	private static void inplaceTransposeMatrix(int[][] matrix) {
		int rows = matrix.length, columns = matrix[0].length;
		System.out.println("Original matrix");

		// print matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < columns; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// print transpose matrix
		System.out.println("Transpose of matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
