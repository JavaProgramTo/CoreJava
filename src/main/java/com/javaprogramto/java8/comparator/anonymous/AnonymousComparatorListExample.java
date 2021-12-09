package com.javaprogramto.java8.comparator.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousComparatorListExample {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();

		strings.add("abc");
		strings.add("mno");
		strings.add("def");
		strings.add("xyz");
		strings.add("ghi");

		System.out.println("List before sorting - " + strings);

		Collections.sort(strings, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {

				String str1 = (String) o1;
				String str2 = (String) o2;
				return str1.compareTo(str2);
			}

		});

		System.out.println("List after sorting with anonymous comparator - " + strings);

		Job job1 = new Job() {

			@Override
			public void post() {
				System.out.println("Posting job 1 now");

			}
		};

	}

}

interface Job {
	void post();
}