package com.javaprogramto.arrays.multidimensional;

import org.apache.commons.lang3.ArrayUtils;

public class NestedArraysExample1 {

	public static void main(String[] args) {

		int[] array1 = {};

		int[] array2 = new int[0];

		int[] array3 = ArrayUtils.EMPTY_INT_ARRAY;
		
		System.out.println("array1 length is "+array1.length);
		System.out.println("array2 length is "+array2.length);
		System.out.println("array3 length is "+array3.length);

	}

}
