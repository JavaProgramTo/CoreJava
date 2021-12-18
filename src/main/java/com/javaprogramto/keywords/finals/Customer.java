package com.javaprogramto.keywords.finals;

public class Customer {

	private int limit;
	//private final int newLimit;
	private static final int newLimit;

	/* public Customer(int limit, int newLimit) {

		this.limit = limit;
		this.newLimit = newLimit;
	}
	*/
	
	/*{
		newLimit = 100;
	}
	*/
	static {
		newLimit = 200;
	}
	
}
