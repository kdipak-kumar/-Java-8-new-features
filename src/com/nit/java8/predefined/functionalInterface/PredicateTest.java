package com.nit.java8.predefined.functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		//using Predicate functional interface we check the given no in even or not
		//by implementing abstract method :boolean test(T t); 
		Predicate<Integer> checkEven= no -> no%2==0;
		
		//invoke Predicate functional interface method boolean test(T t)
		System.out.println("is 15 even  ? "+checkEven.test(15));
		
		
		Predicate<Integer> checkBigger=no -> no>50;
		System.out.println("is 49 biger than 50 ?"+checkBigger.test(49));
        
		//Predicate And chaining
		System.out.println("check the no is checkEven and checkBigger than 50 ?"
		                                       + checkEven.and(checkBigger).test(69));
		
		//predicate Or chaining
		System.out.println("check the no is checkEven or checkBigger than 50 ?"
		                                       + checkEven.or(checkBigger).test(69));
		
		//Predicate negate chaining
		System.out.println("check even on negate : "+checkEven.negate().test(30));
		
		//Predicate static isEqulity()
		Predicate<String> checkEqulity=Predicate.isEqual("Dipak");
		System.out.println("check given data is equal ?"+checkEqulity.test("Dipak"));
	}

}
