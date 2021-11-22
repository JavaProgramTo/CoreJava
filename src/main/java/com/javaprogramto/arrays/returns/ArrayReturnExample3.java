package com.javaprogramto.arrays.returns;

import java.util.Arrays;

public class ArrayReturnExample3 {

	public static void main(String[] args) {

		CustomObject[] objects = getObjects();

		System.out.println("Returned custom objects - " + Arrays.toString(objects));

	}

	// returning custom objects array from method
	public static CustomObject[] getObjects() {
		return new CustomObject[] { new CustomObject("Ram", 30), new CustomObject("Sita", 20) };

	}
}

class CustomObject {
	public String name;
	public int age;

	public CustomObject(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomObject [name=" + name + ", age=" + age + "]";
	}

}
