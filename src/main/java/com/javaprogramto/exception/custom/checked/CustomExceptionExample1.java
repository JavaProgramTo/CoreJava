package com.javaprogramto.exception.custom.checked;

import java.util.Random;

public class CustomExceptionExample1 {

	public static void main(String[] args) throws CustomException {

		Process p = new WordProcess();
		boolean isProcessed = p.process();

		if (isProcessed) {
			p.stop();
		}

	}

}

class CustomException extends Exception {

	public CustomException(String reason) {

		super(reason);
	}
}

class CustomUncheckedException extends RuntimeException {

	public CustomUncheckedException(String reason) {

		super(reason);
	}
}

interface Process {

	boolean process() throws CustomException;

	boolean stop();
}

class WordProcess implements Process {

	@Override
	public boolean process() throws CustomException {

		if (new Random().nextInt(10) % 2 == 0) {
			throw new CustomException("Expecte odd number - but received even no ");
		}

		return false;
	}

	@Override
	public boolean stop() {

		if (new Random().nextInt(10) % 2 == 0) {
			throw new CustomUncheckedException("Expecte odd number - but received even no ");
		}

		return false;
	}
}