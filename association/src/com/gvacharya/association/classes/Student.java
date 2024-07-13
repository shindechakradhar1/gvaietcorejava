package com.gvacharya.association.classes;

import java.util.List;

public class Student {

	private int rollNo;
	private String name;
	
	private Address address;
	
	private List<Subject> subjectList;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, Address address, List<Subject> subjectList) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.subjectList = subjectList;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Student ["
				+ "rollNo=" + rollNo 
				+ ", name=" + name 
				+ ", address=" + address 
				+ ", subjectList=" + subjectList
				+ "]";
	}
	
	
	
}
