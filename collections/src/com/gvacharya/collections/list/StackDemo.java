package com.gvacharya.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.gvacharya.collections.entities.Employee;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<Employee> employeeList = new Stack<>();
		
		
		
		employeeList.push(new Employee(1,"ABC"));
		employeeList.push(new Employee(2,"ABC"));
		employeeList.push(new Employee(3,"ABC"));
		employeeList.push(new Employee(4,"ABC"));
		
		
//		
//		Employee poppedEmployee=employeeList.pop();
//		System.out.println(poppedEmployee);
//		
//		if(employeeList.isEmpty())
//		System.out.println(employeeList.pop());
//		System.out.println(employeeList.pop());
//		System.out.println(employeeList.pop());
//		System.out.println(employeeList.pop());
//		System.out.println(employeeList.pop());
//		System.out.println(employeeList.pop());
//		
		System.out.println(employeeList.size());
		
		List<Employee> empList1 = new ArrayList<>();
		
		while(!employeeList.empty()) {
			empList1.add(employeeList.pop());
		}
		
		System.out.println(empList1);
		
		
		
 	}

}
