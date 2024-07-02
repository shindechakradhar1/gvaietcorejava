package com.gvacharya.collections.map;

import java.util.Map;
import java.util.TreeMap;

import com.gvacharya.collections.entities.Student;

public class TreeMapEample {

	public static void main(String[] args) {
		Map<Student, Float> studentTreeMap = 
				new TreeMap<>();
		
		studentTreeMap.put(new Student(1,"ABC"), 10_000F);
		studentTreeMap.put(new Student(1,"ABC"), 15_000F);
		studentTreeMap.put(new Student(1,"ABC"), 11_000F);
		studentTreeMap.put(new Student(1,"ABC"), 13_000F);
		studentTreeMap.put(null, 13_000F);
		
		studentTreeMap.forEach((k,v)->System.out.println(
				"Key : " + k + "\n" +
				"Value : " + v
		));
		
	}
}
