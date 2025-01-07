package batchpractices;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable, Comparable<Student> {
	private int rollNo;
	private String Name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		Name = name;
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return Objects.equals(this, obj);
	}

	@Override
	public int compareTo(Student o) {
		
		return this.Name.compareTo(o.Name);
	}

}
