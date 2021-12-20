package com.javaprogramto.keywords.extend;

public class ClasesExtendsExamples {

	public static void main(String[] args) {

		HondaCar hondaCar = new HondaCar();
		int noOfWheels = hondaCar.getNoOfWheels();
		System.out.println("Honda car wheels : " + noOfWheels);

	}
}

class Car {

	int noOfWheels = 4;
}

class HondaCar extends Car {

	public int getNoOfWheels() {
		return this.noOfWheels;
	}
}
/*
class HybridCar extends Car , HondaCar{

}
*/

class SkodaCar extends Car {

}