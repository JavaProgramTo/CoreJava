package com.javaprogramto.exception.custom.checked;

public class InvalidFileNamePatternException2 extends RuntimeException {

	public InvalidFileNamePatternException2(String reason, Throwable t) {
		super(reason, t);
	}

}
