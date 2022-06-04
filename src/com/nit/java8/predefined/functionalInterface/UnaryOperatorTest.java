package com.nit.java8.predefined.functionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {

		// implement Function function interface by using lambada
		   Function<String, String> upperCase = input -> input.toUpperCase();
		// call Function method apply(T t)
		   System.out.println("given string convert to uppercase : " + upperCase.apply("Java By me"));
		
		   
		   
		// implement UnaryOperator function interface by using lambada
		   UnaryOperator<String> unaryUppercase=input -> input.toUpperCase();
	    // call UnaryOperator method apply(T t)
	       System.out.println("given string convert to uppercase : " + unaryUppercase.apply("UnaryOperator Java By me"));
			
		

		// call Identity method
		Function<String, String> sameObj = Function.identity();
		System.out.println("return same object : " + sameObj.apply("Java"));
		// using null
		System.out.println(Function.identity().apply(null));
		
		

		 // call Identity method
		 UnaryOperator<String> unarySameObj = UnaryOperator.identity();
		 System.out.println("return same object : " + unarySameObj.apply("UnaryOperator Java"));
		 // using null
		 System.out.println(UnaryOperator.identity().apply(null));

		 
		 //NOTE:
		 //we can implement below program by using UnaryOperator like what are  done in above program
 
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
