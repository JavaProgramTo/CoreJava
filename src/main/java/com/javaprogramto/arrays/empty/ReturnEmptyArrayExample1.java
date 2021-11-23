package com.javaprogramto.arrays.empty;

public class ReturnEmptyArrayExample1 {

	public static void main(String[] args) {

		if (true) {
			int[] array1 = emptyArray();
			System.out.println("Length of int array 1 : " + array1.length);
		}
		
		if( 40 % 10 == 0) {
			int[] array2 = emptyArray();
			System.out.println("Length of int array 2 : " + array2.length);
		}

	}

	public static int[] emptyArray() {

		return new int[0];
	}
}
