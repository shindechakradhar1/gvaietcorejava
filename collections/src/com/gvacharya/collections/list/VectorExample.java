package com.gvacharya.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.gvacharya.collections.entities.Employee;

public class VectorExample {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Shradhha");
		List<Employee> employeeList = new Vector<>();
		List<Employee> employeeList1 = Arrays.asList(
				new Employee(2,"EMP2"),
				new Employee(3,"EMP3"),
				new Employee(4,"EMP4"),
				emp
		);
		
		employeeList.add(new Employee(8,"ABC"));
		employeeList.add(new Employee(9,"BBC"));
		employeeList.add(emp);
//		
////		Employee emp1=employeeList.get(0);
////		System.out.println(emp1);
//		
//		employeeList.addAll(employeeList1);
//		
////		employeeList.remove(1);
//		
//		employeeList.removeIf(e->e.getName().equals("EMP3"));
//		
//		employeeList.forEach(System.out::println);
		
		employeeList.retainAll(employeeList1);
		
		System.out.println(employeeList);
		
	}
}
