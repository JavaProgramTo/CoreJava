package com.javaprogramto.arrays.sort.reverse;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortReverseStrings {

	public static void main(String[] args) {

		String[] stringArray = new String[5];
		stringArray[0] = "G";
		stringArray[1] = "Z";
		stringArray[2] = "A";
		stringArray[3] = "N";
		stringArray[4] = "I";

		System.out.println("String array before sort - " + Arrays.toString(stringArray));
		Arrays.sort(stringArray, Collections.reverseOrder());

		System.out.println("String array after sort - " + Arrays.toString(stringArray));

	}

}
