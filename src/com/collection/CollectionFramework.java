package com.collection;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class  CollectionFramework {
	
	public static void main(String arg[]){
		List<Employee> emps = Employee.getEmployees();
		Queue<String> stq = new ArrayDeque<>();
		stq.add("Ram");
		stq.add("Shyam");
		stq.add("Abdul");
		
		stq.forEach(System.out::println);
	}
}
