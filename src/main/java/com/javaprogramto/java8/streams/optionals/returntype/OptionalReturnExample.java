package com.javaprogramto.java8.streams.optionals.returntype;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalReturnExample {

	private static Map<Integer, String> idNames = new HashMap<>();

	public static void main(String[] args) {

		idNames.put(100, "jacowith");
		idNames.put(200, "Hemon");
		idNames.put(300, "Suwaari");
		idNames.put(400, "Meanon");
		idNames.put(500, "Zulia");

		Optional<String> id300Name = getNameById(300);

		if (id300Name.isPresent()) {
			String value = id300Name.get();
			System.out.println("id 300 name : " + value);
		}

		Optional<String> idUnknown = getNameById(700);

		if (idUnknown.isPresent()) {
			String value = idUnknown.get();
			System.out.println("id 700 name : " + value);
		} else {
			System.out.println("id 700 is unknown  one");
		}

		getNameById(400).ifPresent(value -> System.out.println("id  400 value is  : " + value));
		getNameById(900).ifPresentOrElse(value -> System.out.println("id  900 value is  : " + value),
				() -> System.out.println("id 900 not found"));

	}

	public static Optional<String> getNameById(int id) {

		String name = idNames.get(id);

		Optional<String> nameOptional = Optional.ofNullable(name);

		return nameOptional;
	}

}
