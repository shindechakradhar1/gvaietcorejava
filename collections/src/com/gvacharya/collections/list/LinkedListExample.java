package com.gvacharya.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.gvacharya.collections.comparators.EmployeeComparator;
import com.gvacharya.collections.entities.Employee;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> intLinkedList = new LinkedList<>();
		
		intLinkedList.add(10);
		
		intLinkedList.add(1, 12);
		System.out.println(intLinkedList);
		
		intLinkedList.addAll(Arrays.asList(13,14,15,16,17,18,19));
		
		intLinkedList.add(6, 16);
		System.out.println(intLinkedList);
		
//		intLinkedList.remove(6);
//		intLinkedList.remove(Integer.valueOf(10));
		
		intLinkedList.get(6);
		
		boolean isContains=intLinkedList.contains(25);
		System.out.println(isContains);
		
		
		// cursor object which works like pointer
		
		Enumeration<Integer> enumerate = Collections.enumeration(intLinkedList);
		while(enumerate.hasMoreElements()) {
			System.out.println(enumerate.nextElement());
		}
		
//		for(Integer element:intLinkedList) {
//			System.out.println(element);
//			int index=intLinkedList.get(element);
//			intLinkedList.set(index, element+5);			
//		}
		
		
		
		
		List<Integer> intLinkedList1 = Arrays.asList(1,2,3,4);
		
		ListIterator<Integer> integerListIterator = 
				intLinkedList1.listIterator();
		
		int i=0;
		
		while(integerListIterator.hasNext()) {
			System.out.println(i + " : " + integerListIterator.next());
			integerListIterator.set(i++);
		}
		
		System.out.println("last" + intLinkedList1);
		
		intLinkedList.sort((e1,e2)->e1.compareTo(e2));
		
		intLinkedList.sort(Comparable::compareTo);
		
		Collections.sort(intLinkedList);
		
		System.out.println();
		
		
		List<Employee> employeeList = new LinkedList<>();
		
		employeeList.add(new Employee(2,"EMP31"));
		employeeList.add(new Employee(5,"EMP61"));
		employeeList.add(new Employee(3,"EMP81"));
		employeeList.add(new Employee(1,"EMP51"));
		
//		Collections.sort(employeeList);
//		
//		System.out.println(employeeList);
		
//		Comparator<Employee> idComparator = (e1,e2)->Integer.compare(e1.getId(), e2.getId());
		
		employeeList.sort((e1,e2)->Integer.compare(e1.getId(), e2.getId()));
		System.out.println(employeeList);
		
		employeeList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println(employeeList);
		
		try(
				Stream<Employee> employeeStream = employeeList.stream();
		){
//			employeeStream
//				.sorted(EmployeeComparator.nameComparator)
//					.forEach(System.out::println);
			employeeStream
			.sorted(EmployeeComparator.idComparator)
			.forEach(System.out::println);
		}
		
		
	}
	
}
