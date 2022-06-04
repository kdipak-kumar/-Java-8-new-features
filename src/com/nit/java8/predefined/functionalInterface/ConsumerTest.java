package com.nit.java8.predefined.functionalInterface;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		
		 Consumer<String> convert=input-> System.out.println("convert string :"+input.toUpperCase());
		 convert.accept("my favirate java");
		 
		 Consumer<String> printMsg=input->System.out.println("print msg :"+input);
		 
		 printMsg.andThen(convert).accept("my name dipak");
	}

}
