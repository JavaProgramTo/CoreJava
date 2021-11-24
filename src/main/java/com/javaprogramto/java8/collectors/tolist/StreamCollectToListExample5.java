package com.javaprogramto.java8.collectors.tolist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCollectToListExample5 {

	public static void main(String[] args) {
		
		IntStream infiniteStream  = IntStream.iterate(1000,  i -> i + 1000);
		
		List<Integer> numbersList = infiniteStream.limit(5).boxed().collect(Collectors.toList());
		
		System.out.println("infinite stream collect to ArrayList output : " + numbersList);

	}
}
