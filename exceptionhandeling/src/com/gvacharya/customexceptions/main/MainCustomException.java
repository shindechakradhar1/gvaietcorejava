package com.gvacharya.customexceptions.main;

import com.gvacharya.customexceptions.InvalidNameException;
import com.gvacharya.customexceptions.entities.Student;

public class MainCustomException {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setId(10);
		try {
			student.setName("");
		} catch (InvalidNameException e) {
			e.printStackTrace();
		}
		
		System.out.println(student);
	}
}
