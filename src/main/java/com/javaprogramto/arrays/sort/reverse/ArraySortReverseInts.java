package com.javaprogramto.arrays.sort.reverse;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortReverseInts {

	public static void main(String[] args) {

		Integer[] ints = new Integer[5];
		ints[0] = 20;
		ints[1] = 50;
		ints[2] = 40;
		ints[3] = 10;
		ints[4] = 30;

		System.out.println("Integer array before sort - " + Arrays.toString(ints));
		
		Arrays.sort(ints, Collections.reverseOrder());

		System.out.println("Integer array after sort - " + Arrays.toString(ints));

	}

}
