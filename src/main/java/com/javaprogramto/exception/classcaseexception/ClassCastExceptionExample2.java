package com.javaprogramto.exception.classcaseexception;

import java.util.ArrayList;
import java.util.List;

public class ClassCastExceptionExample2 {

	public static void main(String[] args) {

		List list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add("String");
		list.add(30);

		for (int i = 0; i < list.size(); i++) {
			Integer value = (Integer) list.get(i);
			System.out.println(value);
		}
	}
}
