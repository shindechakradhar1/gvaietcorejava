package com.gvacharya.oops.encapsulation;

public class Student {

	private String name;
	private String standard;
	private float fees;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String standard, float fees) {
		super();
		this.name = name;
		this.standard = standard;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		if(fees>50000)
			this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", standard=" + standard + ", fees=" + fees + "]";
	}

}
