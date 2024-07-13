package com.gvacharya.association;

import java.util.ArrayList;
import java.util.List;

import com.gvacharya.association.classes.Address;
import com.gvacharya.association.classes.Student;
import com.gvacharya.association.classes.Subject;

public class App {

	public static void main(String[] args) {
		Student student = new Student();
		student.setRollNo(10);
		student.setName("ABC");
		System.out.println(student);
		
		Address address = new Address();
		address.setLaneNo(1);
		address.setLandMark("GVAIET");
		address.setArea("Shelu-");
		address.setCity("Raigad");
		address.setState("Maharashtra");
		
		student.setAddress(address);
		
		List<Subject> subjectList = new ArrayList<>();
		
		subjectList.add(new Subject("Deep Learning"));
		subjectList.add(new Subject("Social Media"));
		subjectList.add(new Subject("Distributed Computing"));
		subjectList.add(new Subject("Quantam Computing"));
		
		student.setSubjectList(subjectList);
		
		System.out.println(student);
	}
}
