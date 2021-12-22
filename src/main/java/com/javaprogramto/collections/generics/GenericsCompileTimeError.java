package com.javaprogramto.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsCompileTimeError {

	public static void main(String[] args) {
		
		List<Integer> integers = null;
		
		// uncomment to see the error
		//integers = new ArrayList<int>();
	}
}
