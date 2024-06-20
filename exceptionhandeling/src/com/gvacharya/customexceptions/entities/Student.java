package com.gvacharya.customexceptions.entities;

import com.gvacharya.customexceptions.InvalidIdException;
import com.gvacharya.customexceptions.InvalidNameException;

public class Student {
	private int id;
	private String name;

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id>0)
			this.id = id;
		else
			throw new InvalidIdException("Id should be Greater Than 0");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException{
		if(name.length()>0)
			this.name = name;
		else
			throw new InvalidNameException(); 
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}