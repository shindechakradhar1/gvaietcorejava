package com.gvacharya.generic;

import java.util.ArrayList;
import java.util.Collections;

import com.gvacharya.generic.classes.ObjectBox;
import com.gvacharya.generic.classes.Student;

public class GenericExample {

	public static void main(String[] args) {
//		List<Integer> intList = new ArrayList<>();
//		
//		ObjectBox<Integer> intBox = new ObjectBox<>();
//		intBox.setList(intList);
//		
//		boolean result=intBox.addElement(30);
//		boolean result1=intBox.addElement(10);
//		boolean result2=intBox.addElement(20);
//		System.out.println(result);
//		
////		System.out.println(intList);
//		
//		
//		List<String> stringList = new ArrayList<>();
//		ObjectBox<String> stringBox= new ObjectBox<>();
//		stringBox.setList(stringList);
//		stringBox.addElement("BBC");
//		stringBox.addElement("ABC");
//		stringBox.addElement("DBC");
//		stringBox.addElement("CBC");
//		
////		System.out.println(stringList);
//		
//		
////		List<?> resutlIntList = intBox.getList();
////		List<?> resutlStringList = stringBox.getList();
////		
////		resutlIntList.forEach(System.out::println);
////		resutlStringList.forEach(System.out::println);
//		
////		intBox.addElement("ABC");
//		
//		intBox.zForEach();
//		stringBox.zForEach();
//		
//		zSort(intBox);
//		zSort(stringBox);
		
		ObjectBox<Student> studentBox = new ObjectBox<>();
		
		studentBox.setList(new ArrayList<Student>());
		
		studentBox.addElement(new Student(3,"DBC"));
		studentBox.addElement(new Student(2,"BBC"));
		studentBox.addElement(new Student(1,"ABC"));
		studentBox.addElement(new Student(4,"EBC"));
		
		studentBox.zForEach();

		zSort(studentBox);
	}
	
	public static <Z extends Comparable<Z>> void zSort(ObjectBox<Z> zlist) {
		Collections.sort(zlist.getList());
		System.out.println(zlist.getList());
	}
}
