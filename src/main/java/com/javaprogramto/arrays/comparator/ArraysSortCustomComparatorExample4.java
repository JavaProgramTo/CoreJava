package com.javaprogramto.arrays.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustomComparatorExample4 {

	public static void main(String[] args) {

		int[][] array = { { 1, 2 }, { 7, 8 }, { 3, 4 }, { 9, 0 }, { 5, 6 } };

		// java 7
		System.out.println("emp array before sort - ");
		System.out.println(Arrays.deepToString(array));

		Comparator<? super int[]> sortByFirstValue = new Comparator<int[]>() {
			@Override
			public int compare(int[] i1, int[] i2) {
				return Integer.compare(i1[0], i2[0]);
			}
		};

		Arrays.sort(array, sortByFirstValue);

		System.out.println("\nemp array after sort - ");
		System.out.println(Arrays.deepToString(array));

	}
}
