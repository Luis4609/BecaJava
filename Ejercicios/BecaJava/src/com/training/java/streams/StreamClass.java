/**
 * 
 */
package com.training.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Testing Stream() in Java 8
 * 
 * @author luis.monzon
 *
 */
public class StreamClass {

	// Creation

	// Empty Stream : We should use the empty() method in case of the creation of an
	// empty stream
	Stream<String> streamEmpty = Stream.empty();

	// We often use the empty() method upon creation to avoid returning null for
	// streams with no element
	public Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

	List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b"))
			.collect(Collectors.toList());
	Optional<String> anyElement = elements.stream().findAny();
	Optional<String> firstElement = elements.stream().findFirst();

	
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		long size = list.stream().skip(1)
		  .map(element ->element.substring(0, 3)).sorted().count();
		
		System.out.println("Size of the list: " + size);
	}
}

