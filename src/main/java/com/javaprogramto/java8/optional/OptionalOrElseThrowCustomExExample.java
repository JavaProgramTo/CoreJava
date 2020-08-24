package com.javaprogramto.java8.optional;

import java.util.Optional;

public class OptionalOrElseThrowCustomExExample {
	public static void main(String[] args) throws CustomException {

		// orElseThrow() runtime IllegalArgumentException example
		String nullValue = null;
		String blank = Optional.ofNullable(nullValue).orElseThrow(IllegalArgumentException::new);
		System.out.println(blank);

		// throwing checked exception
		String value = null;
		String blank2 = Optional.ofNullable(value).orElseThrow(CustomException::new);
		System.out.println(blank2);

	}
}

class CustomException extends Exception {

	public CustomException() {

	}
}