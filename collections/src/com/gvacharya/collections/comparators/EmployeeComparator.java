package com.gvacharya.collections.comparators;

import java.util.Comparator;

import com.gvacharya.collections.entities.Employee;

public class EmployeeComparator {

	public static Comparator<Employee> nameComparator = 
			(e1,e2)->e1.getName().compareTo(e2.getName());
			
	public static Comparator<Employee> idComparator = 
			(e1,e2)->Integer.compare(e1.getId(), e2.getId());
}
