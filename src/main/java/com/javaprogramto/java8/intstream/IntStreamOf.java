package com.javaprogramto.java8.intstream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOf {

	public static void main(String[] args) {

		IntStream singleValue = IntStream.of(10);

		IntStream multipleValeus = IntStream.of(1, 5, 10, 20, 30);

		IntStream range10to15range = IntStream.range(10, 15);
		IntStream range10to15closed = IntStream.rangeClosed(10, 15);

		System.out.println("range(10, 15) : " + Arrays.toString(range10to15range.toArray()));
		System.out.println("rangeClosed(10, 15) : " + Arrays.toString(range10to15closed.toArray()));

		System.out.println("range(10, 15) min value : " + IntStream.range(10, 15).min().getAsInt());
		System.out.println("range(10, 15) max value : " + IntStream.range(10, 15).max().getAsInt());

		IntStream random = IntStream.generate(() -> {
			return (int) Math.random() * 5000;
		});

		System.out.println("for loop");
		for (int i = 1000; i < 20000; i = i + 4000) {
			print(i);
		}

		System.out.println("intstream foreach loop");
		IntStream iterate = IntStream.iterate(1000, i -> i + 4000).limit(5);

		iterate.forEach(n -> print(n));

		System.out.println("findFirst value : " + IntStream.iterate(10, i -> i + 2).limit(100).findFirst().getAsInt());
		System.out.println("findAny value : " + IntStream.iterate(10, i -> i + 2).limit(100).findAny().getAsInt());

		System.out.println("parallel findAny value : "
				+ IntStream.iterate(10, i -> i + 2).limit(100).parallel().findAny().getAsInt());

		IntStream mapInput = IntStream.iterate(10, i -> i + 1).limit(10);

		// System.out.println("map input stream :
		// "+Arrays.toString(mapInput.toArray()));

		IntStream mapOutput = mapInput.map(i -> i * 2);

		System.out.println("map Output stream : " + Arrays.toString(mapOutput.toArray()));

		IntStream input1 = IntStream.iterate(10, i -> i + 1).limit(10);
		IntStream input2 = IntStream.iterate(10, i -> i + 1).limit(10);

		// IntStream nestedIntStream = IntStream.of(input1, input2);

		System.out.println("flat map : " + Arrays.toString(input1.flatMap(i -> IntStream.of(i)).toArray()));

		System.out.println("findFirst value : " + IntStream.iterate(10, i -> i + 2).limit(100).findFirst().getAsInt());

		IntStream stream = IntStream.range(100, 200);

		// filter by number divisible by 5 and 7
		System.out.println("numbers divisible by 5 and 7 are : ");
		stream.filter(i -> (i % 5 == 0 && i % 7 == 0)).forEach(System.out::println);

		IntStream stream2 = IntStream.range(100, 200);

		List<Integer> primes = stream2.filter(IntStreamOf::checkPrime).boxed().collect(Collectors.toList());

		System.out.println("Prime numbers (100, 200) are " + primes);

		Arrays.toString(IntStream.of(1, 2, 3, 1, 2, 3).distinct().toArray());
		System.out.println(Arrays.toString(IntStream.of(1, 2, 3, 1, 2, 3).distinct().toArray()));

		
		int[] intArray = IntStream.of(1, 2, 3, 1, 2, 3).toArray();
		System.out.println("int array : "+Arrays.toString(intArray));
		

		List<Integer> list = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toList());
		System.out.println("IntStream to List : "+list);
		
		Set<Integer> set = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toSet());
		System.out.println("IntStream to Set : "+set);
	}

	private static void print(int n) {
		System.out.println(n);
	}

	private static boolean checkPrime(int n) {
		IntPredicate isDivisible = index -> n % index == 0;
		return n > 1 && IntStream.range(2, n).noneMatch(isDivisible);

	}

}
