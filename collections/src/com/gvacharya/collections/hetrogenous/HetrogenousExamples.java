package com.gvacharya.collections.hetrogenous;

import java.util.ArrayList;
import java.util.List;

import com.gvacharya.collections.entities.Employee;

public class HetrogenousExamples {

	public static void main(String[] args) {
		
		List list = new ArrayList<>(5);
		
		list.add(10);
		list.add("ABC");
		list.add(new Employee(1,"EMP1"));
		
		System.out.println(list);
		
		int[] intArray= {1,2,3};
		int length=intArray.length;
		
	}
}
