package com.javaprogramto.programs.arrays.duplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWithSet {

	public static void main(String[] args) {
		// creating an array
		Integer[] arrayWithDuplicates = new Integer[] { 3, 5, 6, 2, 38, 5, 34, 5, 69, 8, 7, 6 };

		// printing duplicates array
		System.out.println(Arrays.toString(arrayWithDuplicates));

		// passing the array to linked hashset.
		LinkedHashSet<Integer> linkedSet = new LinkedHashSet(Arrays.asList(arrayWithDuplicates));

		Integer[] finalArrayWithoutDuplicates = new Integer[linkedSet.size()] ;
		
		// converting back to int array from set
		 finalArrayWithoutDuplicates = linkedSet.toArray(finalArrayWithoutDuplicates);

		// printing the array
		System.out.println(Arrays.toString(finalArrayWithoutDuplicates));

	}

}
