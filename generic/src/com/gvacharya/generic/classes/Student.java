package com.gvacharya.generic.classes;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;

	public Student() {}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.rollNo, o.rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Student temp = (Student)obj;
		
		return temp.rollNo==this.rollNo && temp.name.equals(this.name);
				
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo, name);
	}
}
