package com.nit.java8.lambada_expression;

import com.nit.java8.functionalInterface.ReturnTypeLambada;
import com.nit.java8.functionalInterface.ReturnWithMultiParam;
import com.nit.java8.functionalInterface.VoidLambadaShape;
import com.nit.java8.functionalInterface.VoidTypeWithOneParam;
import com.nit.java8.functionalInterface.VoidWithTwoParams;

public class LambadExpressionTest {

	private static void simpleLambada() {

		// different ways to define lambada expression
		// 1st way
		VoidLambadaShape rectangle = () -> {
			System.out.println("implement logic for rectangle");
		};
		// 2nd way, if we have only one statement.
		VoidLambadaShape circle = () -> System.out.println("implment logic for circle");
        
	    //invoke Shape implementation method 
		rectangle.voidShapes();
		circle.voidShapes();
	}
	
	private static void returnTypeLambada() {
          // define lambada expression for return type abstract method
		
		ReturnTypeLambada lambad= ()-> {
			System.out.println("return type lambada expression");
			return "return type";
		};
		
		//not possible
//		ReturnTypeLambada lambad1= ()-> return ("return type");
		
		System.out.println(lambad.returnType());
	}
	
	
	private static void parmeterTypeLambada() {
		//if multiple statement
		VoidTypeWithOneParam exp= (param)->{
			System.out.println("Parameter type lambada expression");
			System.out.println(param);
		};
		
		//if single statement
		VoidTypeWithOneParam exp1= (String param) -> System.out.println(param);
		VoidTypeWithOneParam exp2= (param) -> System.out.println(param);
		VoidTypeWithOneParam exp3= param -> System.out.println(param);
		
		
        
		exp.parameterLambada("parmeter type");
		exp1.parameterLambada("parmeter type");
	}
	
	private static void multiParam() {
		
		VoidWithTwoParams  add=(int a, int b)->{
			int res=a+b;
			System.out.println("multi_param: "+res);
		};
		
		VoidWithTwoParams multi=( a,  b)->{
			int res=a*b;
			System.out.println("multi_param: "+res);
		};
		
		
		VoidWithTwoParams param3=(int a, int b)->System.out.println(a+b);
		
		VoidWithTwoParams param4=(a,b)->System.out.println(a+b);
		
		add.twoParams(19, 20);
		multi.twoParams(10, 20);
	}
	
	private static void returnTypeWithMultiParam() {
        // define lambada expression for return type abstract method
		
		ReturnWithMultiParam add= (int a,int b)-> {
			int res=a+b;
			System.out.println("return type lambada expression");
			return res;
		};
		
		ReturnWithMultiParam sub= (int a,int b) -> (a-b);
		
		ReturnWithMultiParam multi= ( a, b) -> a*b;
		
		//not possible
//		ReturnTypeLambada lambad1= ()-> return ("return type");
		
	}
	public static void main(String[] args) {
		

		 simpleLambada();
		 returnTypeLambada();
		 parmeterTypeLambada();
		 multiParam();
	}

}
