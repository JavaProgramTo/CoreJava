package com.javaprogramto.collections.generics;

import java.util.Map;
import java.util.TreeMap;

import com.javaprogramto.models.Employee;

public class GenericsCompileTimeError2 {

	public static void main(String[] args) {
		
		Map<Employee, Boolean> integers = null;
		
		integers = new TreeMap<Employee, boolean>();
	}
}
