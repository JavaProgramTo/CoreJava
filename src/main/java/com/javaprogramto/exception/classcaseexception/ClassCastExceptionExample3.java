package com.javaprogramto.exception.classcaseexception;

public class ClassCastExceptionExample3 {

	public static void main(String[] args) {
		C c = new C();

		if (c instanceof D) {
			D d = (D) c;
		} else {
			System.out.println("c is not instance of d. skipping..");
		}
	}
}

class C {

}

class D extends C {

}