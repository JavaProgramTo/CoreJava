package com.javaprogramto.java8.streams.join;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Java Join Stream Of Strings and stream to string examples.
 * 
 * @author JavaProgramTo.com
 *
 */
public class StreamOfStringJoiningExample {

	public static void main(String[] args) {

		// Creating the List with string values using Arrays.asList() method
		List<String> stringsList = Arrays.asList("1", "2", "3", "4", "5");
		
		Stream<String> stream = stringsList.stream();

		// java 8 join stream of strings or stream to string
		
		// Example - 1: with default delimiter
		String joinWithDefaultDelimiter = stream.collect(Collectors.joining());

		// Example - 2: with delimiter
		String joinWithDelimiter = stream.collect(Collectors.joining(":"));
		
		// Example - 3: with given delimiter pipe(|), suffix and prefix
		String joinWithDelimiterSuffixPrefix = stream.collect(Collectors.joining("|", "[", "]"));

		// printing the values
		System.out.println("Input List of strings : "+stringsList);
		System.out.println("joining() string : "+joinWithDefaultDelimiter);
		System.out.println("joining(delimiter) string : "+joinWithDelimiter);
		System.out.println("joining(delimiter, suffix, prefix) string : "+joinWithDelimiterSuffixPrefix);
	}

}
