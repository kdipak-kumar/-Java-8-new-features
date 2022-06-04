package com.nit.java8.functionalInterface;

public class Address {
	private String firstName;
	private String lastName;
	
	public Address(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}

	@Override
	public String toString() {
		return "Address [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
