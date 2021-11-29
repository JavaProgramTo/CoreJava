package com.javaprogramto.arrays.booleanarray;

public class BooleanArrayExample3 {

	public static void main(String[] args) {

		boolean[] array1 = { false, true, true };

		boolean[] array2 = new boolean[4];

		array2[0] = true;
		array2[1] = false;
		array2[2] = true;
		array2[3] = false;

		boolean[] array3 = new boolean[5];

		for (int i = 0; i < array3.length; i++) {
			array3[i] = i % 2 == 0;
		}

		System.out.println("array1[0] value - " + array1[0]);
		System.out.println("array2[1] value - " + array2[1]);
		System.out.println("array3 last index value - " + array3[array3.length - 1]);
		
		System.out.println("\nboolean array 3 all values using foreach ");
		for(boolean b : array3) {
			System.out.println(b);
		}

	}
}
