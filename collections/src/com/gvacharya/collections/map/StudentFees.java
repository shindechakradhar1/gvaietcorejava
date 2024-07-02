package com.gvacharya.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

import com.gvacharya.collections.entities.Student;

public class StudentFees {

	public static void main(String[] args) {
		Map<Student, Float> studentMap = 
				new LinkedHashMap<>();
		
		studentMap.put(new Student(1,"ABC"), 10000F);
		studentMap.put(new Student(3,"CBC"), 11000F);
		studentMap.put(new Student(2,"BBC"), 10000F);
		studentMap.put(new Student(5,"ABC"), 10000F);
		studentMap.put(new Student(6,"DBC"), 15000F);
		
		studentMap.forEach((k,v)->System.out.println(
				"key =>" + k +
				"Value =>"+ v
				));
		
		for(Student student:studentMap.keySet())
			studentMap.compute(student, (k,v)->v+(v*0.05F));
		
		studentMap.forEach((k,v)->System.out.println(
				"key =>" + k +
				"Value =>"+ v
				));
	}
}
