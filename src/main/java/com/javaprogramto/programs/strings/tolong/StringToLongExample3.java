package com.javaprogramto.programs.strings.tolong;

public class StringToLongExample3 {

	public static void main(String[] args) {

		String positiveString = "12345";

		Long longvalue1 = new Long(positiveString);
		System.out.println("Positive Long value 1 : " + longvalue1);

		String positiveString2 = "+12345";

		Long longvalue2 = new Long(positiveString2);
		System.out.println("Positive Long value 2 : " + longvalue2);
		
		String negativeValue1 = "-12345";

		Long longvalue3 = new Long(negativeValue1);
		System.out.println("Negative Long value 3 : " + longvalue3);

	}

}
