package com.nit.java8.methodANDconstructor_reference;

import com.nit.java8.functionalInterface.Address;
import com.nit.java8.functionalInterface.InterfacePerformAddition;
import com.nit.java8.functionalInterface.StudentInterface;

public class PerformOperation {

	public static void main(String[] args) {
		staticMethodReference();
		instanceMethodReference();
		constructorReference();

	}
	
	public static int staticMethodAddition(int a, int b) {
		return a+b;
	}
	
	public static void staticMethodReference() {
		InterfacePerformAddition add=(a,b)->{
			System.out.print("add operation perform by lambada expression :");
			return a+b;
		};
		System.out.println(add.addition(10, 20));
		
		InterfacePerformAddition addition=PerformOperation::staticMethodAddition;
		System.out.print("add operation perform by static method reference :");
		System.out.println(addition.addition(10, 20));
	}
	
	
	
	public int instanceMethodAddition(int a, int b) {
		return a+b;
	}
	 
	//Instance method reference
	public static void instanceMethodReference() {
		InterfacePerformAddition add=(a,b)->{
			System.out.print("add operation perform by lambada expression :");
			return a+b;
		};
		System.out.println(add.addition(10, 40));
		
		PerformOperation instance=new PerformOperation();
		InterfacePerformAddition addition=instance::instanceMethodAddition;
		System.out.print("add operation perform by instance method reference :");
		System.out.println(addition.addition(10, 40));
	}
	
	//constructor reference
	public static void constructorReference() {
		StudentInterface student=(a,b)->{
			System.out.print("Student operation done by lambada expression :");
			return new Address(a, b);
		};
		System.out.println(student.fullName("dipak", "kumar"));
		
		StudentInterface s=Address::new;
		System.out.print("Student operation done by constructor reference :");
		System.out.println(s.fullName("raja ", "rani"));
		
	}
	
	

}
