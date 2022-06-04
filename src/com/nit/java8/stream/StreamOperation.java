package com.nit.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("hello");
		list.add("dear");
		list.add("what");
		list.add("are");
		list.add("doing");
		list.add("?");
		
		Stream<String> stream=list.stream();
		stream.forEach(System.out::println);
		
		Stream<Integer> ownStream=Stream.of(1,3,5,7,9);
		ownStream.forEach(System.out::println);
		
		Stream<String> parallelStream=list.parallelStream();
		//parallelStream.forEach(System.out::println);
		parallelStream.forEach(input->System.out.println(input));
		
		Stream<String> emptyStream=Stream.empty();
		emptyStream.forEach(System.out::println);
	}
}
