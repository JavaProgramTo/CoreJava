package com.javaprogramto.arrays.empty;

import org.apache.commons.lang3.ArrayUtils;

public class ReturnEmptyArrayExample3 {

	public static void main(String[] args) {

		if (true) {
			int[] array1 = emptyArrayWIthCurlyBraces();
			System.out.println("Length of int array 1 : " + array1.length);
		}

		if (100 > 0) {
			int[] array2 = emptyArrayWIthCurlyBraces();
			System.out.println("Length of int array 2 : " + array2.length);
		}

	}

	public static int[] emptyArrayWIthCurlyBraces() {

		return ArrayUtils.EMPTY_INT_ARRAY;
	}
}
