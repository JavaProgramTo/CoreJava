package com.javaprogramto.exception.classcaseexception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		C a = new C();
		B b = (B) a;
	}
}

class A {

}

class B extends C {

}