package com.javaprogramto.java8.iterate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateForEachExample {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("A", "B", "C", "D");
		
		Iterator<String> it = strings.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
