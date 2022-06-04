package com.nit.java8.stream;

import java.util.List;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private List<String> mobile;
	
	
	public Employee(String name, int age, double salary, List<String> mobile) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", mobile=" + mobile + "]";
	}
	
	
}
