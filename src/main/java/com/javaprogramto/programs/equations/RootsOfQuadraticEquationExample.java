package com.javaprogramto.programs.equations;

public class RootsOfQuadraticEquationExample {

	public static void main(String[] args) {
		double a = 10;
		double b = 50;
		double c = 30;

		printRootsOfQuadraticEquation(a, b, c);

		a = 20;
		b = 20;
		c = 20;

		printRootsOfQuadraticEquation(a, b, c);

	}

	private static void printRootsOfQuadraticEquation(double a, double b, double c) {

		System.out.println("Inputs a : " + a + ", b : " + b + ", c : " + c);
		double determinant = b * b - 4 * a * c;
		double root1;
		double root2;

		// condition check for real and different roots
		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);

			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
		// Condition check for real and equal roots
		else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);

			System.out.format("root1 = root2 = %.2f;", root1);
		}
		// If roots are not real
		else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
					imaginaryPart);
		}
		System.out.println("\n");

	}

}
