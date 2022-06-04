package com.nit.java8.predefined.functionalInterface;

import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {

		// implement Functional function interface by using lambada
		Function<String, String> upperCase = input -> input.toUpperCase();

		// call Function methos apply(T t)
		System.out.println("given string convert to uppercase : " + upperCase.apply("Java By me"));

		// call Identity method
		Function<String, String> sameObj = Function.identity();
		System.out.println("return same object : " + sameObj.apply("Java"));
		// using null
		System.out.println(Function.identity().apply(null));

		// do multiple operation using andThen() method
		Function<Integer, Integer> chainOfMultiple = input -> {
			System.out.println("1st chaining operation of multipication input*2 :" + input * 2);
			return input * 2;
		};
		chainOfMultiple = chainOfMultiple.andThen(input -> {
			System.out.println("2nd chaining operation of multipication input*3 :" + input * 3);
			return input * 3;
		});
		System.out.println("fina result of apply() :" + chainOfMultiple.apply(10));

		// do multiple operation by using
		Function<Integer, Integer> chainOfDivision = input -> {
			System.out.println("2nd chaining operation of Division is input/2 :" + input / 2);
			return input / 2;
		};
		chainOfDivision = chainOfDivision.compose(input -> {
			System.out.println("1st chaining operation of Division is input/3 :" + input/3);
			return input / 3;
		});
		System.out.println("fina result of apply()  :" + chainOfDivision.apply(30));

	}

}
