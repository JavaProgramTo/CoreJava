package com.javaprogramto.datatypes.diff;

public class FloatVsDoubleMemory {

	public static void main(String[] args) {

		System.out.println("Double size");
		int doubleSizeBits = Double.SIZE;
		int doubleSizeInBytes = doubleSizeBits / 8;

		System.out.println("Double size in bytes - " + doubleSizeInBytes);
		System.out.println("Double size in bits - " + doubleSizeBits);

		System.out.println("\n" + "Float size");
		int floatSizeBits = Float.SIZE;
		int floatSizeInBytes = doubleSizeBits / 8;

		System.out.println("Float size in bytes - " + floatSizeInBytes);
		System.out.println("Float size in bits - " + floatSizeBits);
		
	}

}
