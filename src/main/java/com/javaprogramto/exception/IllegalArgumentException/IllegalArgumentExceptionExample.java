package com.javaprogramto.exception.IllegalArgumentException;

import java.util.ArrayList;
import java.util.List;

public class IllegalArgumentExceptionExample {

	public static void main(String[] args) {
		
		// Example 1
		List<String> list = new ArrayList<>(-10);
		list.add("a");
		list.add("b");
		list.add("c");
	}
}
