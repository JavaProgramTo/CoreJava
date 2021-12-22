package com.javaprogramto.collections.generics;

import java.util.Map;

import com.javaprogramto.models.Employee;

public class GenericsCompileTimeError2 {

	public static void main(String[] args) {
		
		Map<Employee, Boolean> integers = null;
		
		// uncomment the below line to see compile time error
		//integers = new TreeMap<Employee, boolean>();
	}
}
