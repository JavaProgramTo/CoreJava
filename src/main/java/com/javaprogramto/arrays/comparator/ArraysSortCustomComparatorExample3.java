package com.javaprogramto.arrays.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustomComparatorExample3 {

	public static void main(String[] args) {

		int[][] array = { { 1, 2 }, { 7, 8 }, { 3, 4 }, { 9, 0 }, { 5, 6 } };

		System.out.println("emp array before sort - ");
		System.out.println(Arrays.deepToString(array));

		Comparator<? super int[]> sortByFirstNumber = Comparator.comparing(innerArray -> innerArray[0]);

		Arrays.sort(array, sortByFirstNumber);

		System.out.println("\nemp array after sort - ");
		System.out.println(Arrays.deepToString(array));
		
		Comparator<? super int[]> sortByFirstNumberAscending = Comparator.comparing(innerArray -> innerArray[0]);
		
		Comparator<? super int[]> sortByFirstNumberDescending  = sortByFirstNumberAscending.reversed();

		Arrays.sort(array, sortByFirstNumberDescending);

		System.out.println("\nemp array after sort descending - ");
		System.out.println(Arrays.deepToString(array));

	}
}
