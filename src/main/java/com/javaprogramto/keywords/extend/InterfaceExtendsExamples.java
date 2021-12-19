package com.javaprogramto.keywords.extend;

public class InterfaceExtendsExamples {

	public static void main(String[] args) {


	}
}


interface Payment {
	
	boolean processPayment();
	
}

interface CreditCardPayment extends Payment{
	
	void validateCardDetails();
}

interface UPIPayment extends Payment{
	
	void validateUPIAddress();
}