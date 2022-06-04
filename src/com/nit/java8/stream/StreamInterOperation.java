package com.nit.java8.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamInterOperation {

	public static void main(String[] args) {
	//	flatOperation();
		flatMaPOperation();
    //  flatMapOperationONList();
    //  filterOperation();
	//	skipAndLimitOperation();
	
		
	}
	public static void flatOperation() {

		List<String> empList=new ArrayList<>();
		empList.add("dipak");
		empList.add("developer");
		empList.add("ten lakhs");
		empList.add("hyderbad");
		empList.add(" single");
		
		Stream<String> empStream=empList.stream();
		System.out.println(empStream);
		empStream.map(input-> input.toUpperCase()).forEach(System.out::println);
		
		
	}
	
	public static void flatMaPOperation() {
		
		String[] list= {"Dipak ","Kumar ","Behera\n"};
		Stream<String> listString=Arrays.stream(list);
		
		System.out.println(listString);
		
		listString.map(input->input).forEach(System.out::print);
		
		Arrays.stream(list).map(input->input)
		                    .flatMap(input->Arrays.stream(input.split("")))
		                    .forEach(System.out::println);
		
		Arrays.stream(list).map(word->word.split("")).flatMap(Arrays::stream)
		                                    .forEach(System.out::println);
		
	}
	
	
	
	
	public static void flatMapOperationONList() {
		List<List<String>> listOfListString=
				                    Arrays.asList(Arrays.asList("Dipak"),Arrays.asList("kumar"));
		System.out.println(listOfListString);
		
		Stream<List<String>> listString=listOfListString.stream();
		  
		listString.map(Collection::stream).forEach(System.out::println);
		  Stream<String> streamString=listOfListString.stream().flatMap(Collection::stream);
		  streamString.forEach(System.out::println);
		 		
//		Stream<String> streamString=listString.flatMap(Collection::stream);
//        Stream<String[]> s=streamString.map(input->input.split(""));
//          s .flatMap(Arrays::stream).forEach(System.out::println);
         
	}
	
	public static void filterOperation() {
		List<String> emp=new ArrayList<>();
		emp.add("Dipak");
		emp.add("Deradone");
		emp.add("Developer");
		emp.add("Odisha");
		emp.add("Balasore");
		
		Stream<String> listStream=emp.stream();
		listStream.filter(input-> input.startsWith("D")).forEach(System.out::println);
	}
	
	public static void skipAndLimitOperation() {
		//limit() operation
		Stream.iterate(1, m->m+1).limit(5).forEach(System.out::println);
		
		//skip () operation
		System.out.println("skip Operation :");
		Stream.iterate(1, n->n+1).limit(10).skip(5).forEach(System.out::println);
		System.out.println("================");
		Stream.iterate(1, a->a+1).skip(5).limit(10).forEach(System.out::println);
		System.out.println("end of skip Operation :");
		
		//using lambada expression
		Stream.generate( ()-> new Random().nextInt(5)).limit(10).forEach(System.out::println);
		System.out.println("================");
		
		//using instance method reference
		Stream.generate( new Random()::nextInt).limit(3).forEach(System.out::println);
	}

	
}

























