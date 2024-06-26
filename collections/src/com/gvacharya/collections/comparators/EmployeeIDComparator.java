package com.gvacharya.collections.comparators;

import java.util.Comparator;

import com.gvacharya.collections.entities.Employee;

public class EmployeeIDComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(),o2.getId());
	}

}
