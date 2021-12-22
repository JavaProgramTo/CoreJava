package com.javaprogramto.keywords.finals;

public class FinalMethodExample1 {

	public static void main(String[] args) {

		Car ford = new FordCar();
		ford.fogLightsOn();

		Car honda = new HondaCar();
		honda.fogLightsOn();

	}
}

class Car {

	public final void fogLightsOn() {
		System.out.println("Fog lights turned on now");
	}
}

class FordCar extends Car {
	// uncomment the below line to see compile time error
	/*public void fogLightsOn() {
		System.out.println("Lights are turned off");
	}
	*/
}

class HondaCar extends Car {

	// uncomment the below line to see compile time error
	/*
	public void fogLightsOn() {
		System.out.println("Lights are turned off permanently");
	}
	*/
}