package com.gvacharya.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gvacharya.collections.entities.Employee;

public class HashSetDemo {

	public static void main(String[] args) {
//		Set<Integer> intSet = new HashSet<>();
//		intSet.add(4);
//		intSet.add(2);
//		intSet.add(3);
//		intSet.add(2);
//		intSet.add(null);
//		intSet.add(1);
//		System.out.println(intSet.size());
//		
//		intSet.forEach(System.out::println);
		
		Set<Employee> employeeSet = new HashSet<>();
		
		employeeSet.add(new Employee(1,"Harish"));
		employeeSet.add(new Employee(2,"Ashish"));
		employeeSet.add(new Employee(3,"Soham"));
		employeeSet.add(new Employee(4,"Mayank"));
		employeeSet.add(new Employee(5,"Bharat"));
		employeeSet.add(new Employee(6,"Aryaman"));
		employeeSet.add(new Employee(7,"Kumna"));
		
		
		System.out.println(new Employee(1,"Nimisha").hashCode());
		System.out.println(new Employee(1,"Nimisha").hashCode());
		System.out.println(new Employee(1,"Nimisha").hashCode());
		System.out.println(employeeSet);
		
//		employeeSet.get
		
//		Advanced for loop
		for(Employee emp:employeeSet) 
			System.out.println(emp);
		
//		forEach
		employeeSet.forEach(System.out::println);
		
//		Stream
		try(
		Stream<Employee> empStream1=employeeSet.stream();
		){
			empStream1.forEach(System.out::println);
		}
		
		
//		Iterator
		Iterator<Employee> empIterator = employeeSet.iterator();
		while(empIterator.hasNext()) {
//			empIterator.remove() is Available
			Employee emp=empIterator.next();
			if(employeeSet.contains(new Employee(1,"asdf")))
				empIterator.remove();
		}
		
//		enumeration (Iteration purpose)
		Enumeration<Employee> empEnumeration= Collections.enumeration(employeeSet);
		
		while(empEnumeration.hasMoreElements())
			System.out.println(empEnumeration.nextElement());
		
		boolean isContains=employeeSet.contains(new Employee(1,"NimIsha"));	
		System.out.println(isContains);
		
		System.out.println(employeeSet.size());
		
//		employeeSet.retainAll(employeeSet);
		
		employeeSet.remove(new Employee(1, "Nimisha"));
		System.out.println(employeeSet);
		
		
//		toArray()
		Employee[] empArray = (Employee[])employeeSet.toArray(new Employee[0]);
		
//		Stream to array and List
		Employee[] empArray1;
		try(Stream<Employee> empStream2 = employeeSet.stream()){
			empArray1 = empStream2
							.filter(e-> e.getName().length()>=6 && e.getName().charAt(5)=='h')
								.toArray(Employee[]::new);
		}
		System.out.println(Arrays.toString(empArray1));
		
		List<Integer> idList;
		try(Stream<Employee> empStream2 = employeeSet.stream()){
//			collect(Collectors.toList() will return modifiable List object
			idList = empStream2
					.map(e->e.getId())
						.collect(Collectors.toList());
//			toList will return Immutable List object(UnsupportedOperationEception
//			idList = empStream2.map(e->e.getId()).sorted().toList();
		}
	
		idList.sort(Integer::compare);
		
//		int i=0;
//		Iterator<Integer> intIterator = idList.iterator();
//		while(intIterator.hasNext()) {
//			intIterator.next();
//			intIterator.remove();
//		}
		
		System.out.println(idList);
		
		
		
	}
}
