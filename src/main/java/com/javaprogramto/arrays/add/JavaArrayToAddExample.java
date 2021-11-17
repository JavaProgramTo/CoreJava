package com.javaprogramto.arrays.add;

import java.util.Arrays;

public class JavaArrayToAddExample {

	public static void main(String[] args) {

		int[] values = new int[5];

		values[0] = 0;
		values[1] = 1;
		values[2] = 2;
		values[3] = 3;
		values[4] = 4;

		int[] newArray = new int[5 + 1];

		for (int i = 0; i < values.length; i++) {
			newArray[i] = values[i];
		}

		int newValue = 5;
		int newArraylength = newArray.length;
		newArray[newArraylength - 1] = newValue;
		
		System.out.println("existing array values  " + Arrays.toString(values));
		System.out.println("new array values  " + Arrays.toString(newArray));

	}

}
