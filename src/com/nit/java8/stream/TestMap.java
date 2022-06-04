package com.nit.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {

	public static void main(String[] args) {
		List<Employee> l1 = Arrays.asList(
				new Employee("Ram",  25, 25200, Arrays.asList("8809897","789097878")),
				new Employee("kiran",  55, 786666, Arrays.asList("870686","67390003")),
				
				new Employee("Sawavan", 25, 2520000, Arrays.asList("90909067","4575454765")),
				new Employee("Raja",    35, 37200, Arrays.asList("8809897","789097878")));

		
		List<Employee> list=l1.stream().filter(i1 -> i1.getSalary()>20000 && i1.getName().startsWith("R"))
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println("============================");
             l1.stream().filter(i1 -> i1.getSalary()>20000 && i1.getName().startsWith("R"))
				.map(input->input.getName()).forEach(System.out::println);
             System.out.println("============================");
            List<String> coll= 
            		l1.stream().filter(i1 -> i1.getSalary()>20000 && i1.getName().startsWith("R"))
				.map(input->input.getName()).collect(Collectors.toList());
            System.out.println("Collector :"+coll);
            
         
             
             l1.stream().map(emp->emp.getMobile()).forEach(System.out::println);
             //using Collection:: stream static method reference
             l1.stream().map(emp->emp.getMobile()).flatMap(Collection::stream)
                               .forEach(System.out::println);
             //using lambada method
             l1.stream().map(emp->emp.getMobile()).flatMap(no->no.stream())
             .forEach(System.out::println);
             
             l1.stream().map(emp->emp.getMobile()).flatMap(mob->mob.stream())
                                                  .flatMap(singleNo->Arrays.stream(singleNo.split("")))
                                                   .forEach(System.out::println);
             
             //for test purpose
             String s="abc";
             Stream<String> sr=Arrays.stream(s.split(""));
	}

}
