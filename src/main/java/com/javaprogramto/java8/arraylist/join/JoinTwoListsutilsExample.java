package com.javaprogramto.java8.arraylist.join;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class JoinTwoListsutilsExample {

	public static void main(String[] args) {
		// Creating list 1

		List<String> list1 = new ArrayList<>();

		list1.add("A");
		list1.add("B");

		// creating list 2
		List<String> list2 = new ArrayList<>();

		list2.add("C");
		list2.add("D");

		// adding two list values into one using ListUtils.union() method
		List<String> unionOfLists = ListUtils.union(list1, list2);
		
		System.out.println("List 1 values : "+list1);
		System.out.println("List 2 values : "+list2);
		System.out.println("ListUtils union list values : "+unionOfLists);

	}

}
