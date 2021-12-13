package com.javaprogramto.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsCompileTimeErrorFix {

	public static void main(String[] args) {

		List<Integer> integers = null;

		integers = new ArrayList<Integer>();

		integers.add(100);
	}
}
