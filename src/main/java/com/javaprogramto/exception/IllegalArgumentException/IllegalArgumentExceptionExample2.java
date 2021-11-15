package com.javaprogramto.exception.IllegalArgumentException;

import java.util.ArrayList;
import java.util.List;

public class IllegalArgumentExceptionExample2 {

	public static void main(String[] args) {
		
		// Example 2
		List<String> stringsList = new ArrayList<>();
		stringsList.add("a");
		stringsList.add("b");
		stringsList.add("c");
		
		stringsList.stream().skip(-100);
	}
}
