/**
 * 
 */
package com.training.java.basic.capitulo6.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://mkyong.com/java8/java-8-predicate-examples/
 * https://www.geeksforgeeks.org/arrays-stream-method-in-java/
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
 * 
 * @author luis.monzon
 *
 */
public class Java8Predicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Predicate
		Predicate<Integer> noGreaterThan5 = x -> x > 5;

		// Create a list of Integers from 1-10
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Get the elements from the list, that match the Predicate ( > 5)
//		List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
		List<Integer> collect = list.stream().filter(noGreaterThan5).collect(Collectors.toList());

		// Show the result of the filter with noGreaterThan5
		System.out.println("With Predicate: " + collect);

		// Creating an Arrays of String
		String[] arr = { "Geeks", "for", "Geeks" };

		// Using Arrays.stream() to convert
		// array into Stream
		Stream<String> stream = Arrays.stream(arr);
		// List into Stream
		Stream<Integer> streamInt = list.stream();

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));
		System.out.println("");
		streamInt.forEach(num -> System.out.print(num + " "));

//		System.out.println("Find first: " + stream.findFirst());
	}

}
