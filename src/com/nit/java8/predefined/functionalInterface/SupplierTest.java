 package com.nit.java8.predefined.functionalInterface;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		Supplier<Integer> currentDayOfMonth=()-> LocalDate.now().getDayOfMonth();
		
		System.out.println("The current date of month :"+currentDayOfMonth.get());
		
		Supplier<Month> currentMonth=()-> LocalDate.now().getMonth();
		System.out.println("The current  month :"+currentMonth.get());
		
		Supplier<String> currentDay=()->LocalDate.now().getDayOfWeek().name();
		System.out.println("The current name of day :"+currentDay.get());
	}

}
