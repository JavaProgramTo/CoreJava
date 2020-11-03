
package com.javaprogramto.programs.maths;

import java.math.BigInteger;

public class LCMOfLargeNumbers {

	public static void main(String[] args) {
		
		BigInteger large1 = new BigInteger("123456789123456789123456");
		BigInteger large2 = new BigInteger("987654321987654321987654");

		BigInteger gcd = large1.gcd(large2);
		
		BigInteger multiply = large1.multiply(large2);
		
		BigInteger lcm = multiply.divide(gcd);
		
		System.out.println("Final LCM output: "+lcm.toString());
	
	}

}
