package com.app.streams;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
	 
		Stream<Integer> s=Stream.of(32,456,43,65,67);
		s.forEach(System.out::println);
		System.out.println();
		
		Integer [] i= {34,5657,32,54,67,678,9};
		Stream.of(i).forEach(System.out::println);

	}

}
