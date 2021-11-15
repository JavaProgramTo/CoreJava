package com.javaprogramto.programs.strings.tolong;

public class StringToLongExample {

	public static void main(String[] args) {

		String positiveString = "12345";

		long longvalue1 = Long.parseLong(positiveString);
		System.out.println("Positive Long value 1 : " + longvalue1);

		String positiveString2 = "+12345";

		long longvalue2 = Long.parseLong(positiveString2);
		System.out.println("Positive Long value 2 : " + longvalue2);
		
		String negativeValue1 = "-12345";

		long longvalue3 = Long.parseLong(negativeValue1);
		System.out.println("Negative Long value 3 : " + longvalue3);

	}

}
