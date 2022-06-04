package com.nit.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {

	public static void main(String[] args) {

		// reduceOperation();
//		collectOperation();
//		collectAndThenOperation();
//		groupingByOperation();
		partitoningByOperation();

	}

	public static void reduceOperation() {
		System.out.println(
				"The Addition of 1 to 10  :\n" + Stream.iterate(1, n -> n + 1).limit(10).reduce(0, (a, b) -> a + b));
		System.out.println(
				"The Addition of 1 to 20  :\n" + Stream.iterate(1, n -> n + 1).limit(20).reduce(0, (a, b) -> a + b));
		System.out
				.println("The factorial of 5  :\n" + Stream.iterate(1, n -> n + 1).limit(5).reduce(1, (a, b) -> a * b));
		System.out
				.println("The factorial of 7  :\n" + Stream.iterate(1, n -> n + 1).limit(7).reduce(1, (a, b) -> a * b));
	}

	public static void collectOperation() {
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("java");
		list.add("java");

		List<String> s1 = list.stream().collect(Collectors.toList());
		System.out.println(s1);

		List<String> s = list.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
		System.out.println(s);
	}

	public static void collectAndThenOperation() {

		List<Product> productsList = Arrays.asList(new Product("Nokia", 12990, "12990"),
				new Product("Vivo", 12990, "12990"),
				new Product("MI", 29990, "29990"), 
				new Product("Poco", 12990, "12990"),
				new Product("Iq00", 12990, "12990"),
				new Product("Gt neo", 12990, "12990"),
				new Product("RealMe", 29090, "29090"),
				new Product("Iphone", 90090, "90090"),
		new Product("Iphone 14", 12990, "12990"));                
                 		
		// System.out.println(productsList.toArray());

		List<Product> l1 = productsList.stream().collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("============================");

		productsList.stream().map(prod -> prod).forEach(System.out::println);

		System.out.println("============================");

		productsList.stream().flatMap(prod -> Stream.of(prod)).forEach(System.out::println);

		System.out.println("============================");

		productsList.stream().map(prod -> prod).flatMap(prod -> Stream.of(prod)).forEach(System.out::println);
		System.out.println("============================");
		productsList.forEach(p -> System.out.println(p.toString()));

		Product max = (Product)(productsList.stream()
				.collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)),
						(Optional<Product> prod) -> prod.isPresent() ? prod.get(): "nothing")));

		System.out.println("highest price  of mobile is :"+max.getBrandName() +" and its price is :"+max.getPrice());
		
		

		Product min = (Product)(productsList.stream()
				.collect(Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Product::getPriceInString)),
						(Optional<Product> prod) -> prod.isPresent() ? prod.get() : "nothing")));

		System.out.println("minimum price  of mobile is :"+min.getBrandName() +" and its price is :"+min.getPrice());
	}
	
	public static void groupingByOperation() {
		List<Product> productsList = Arrays.asList(
				new Product("Nokia", 12990, "12990"),
				new Product("Vivo", 12990, "12990"),
				new Product("MI", 29990, "29990"), 
				new Product("Poco", 29990, "29990"),
				new Product("Iq00", 12990, "12990"),
				new Product("Gt neo", 29090, "29090"),
				new Product("RealMe", 29090, "29090"),
				new Product("Iphone", 90090, "90090"),
		new Product("Iphone 14", 90090, "90090"));                
                 		
		
		Map<Long, List<Product>> mapProduct=productsList.stream()
				                                      .collect(Collectors.groupingBy(Product::getPrice));
		System.out.println(mapProduct);
	}
	public static void partitoningByOperation() {
		List<Product> productsList = Arrays.asList(
				new Product("Nokia", 12990, "12990"),
				new Product("Vivo", 12990, "12990"),
				new Product("MI",  30000, "29990"), 
				new Product("Poco", 30000, "29990"),
				new Product("Iq00", 12990, "12990"),
				new Product("Gt neo", 29000, "29090"),
				new Product("RealMe", 29000, "29090"),
				new Product("Iphone", 90090, "90090"),
		     new Product("Iphone 14", 90090, "90090"));
		
		
		Map<Boolean,List<Product>> prods=productsList.stream()
				.collect(Collectors.partitioningBy(prod->prod.getPrice()>=29000));
		System.out.println(prods);
		
		
		
	}
	

}
