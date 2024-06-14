package com.gvacharya.oops.inheritance.multilevel;

public class Dog extends Animal {

	private boolean loyal;

	public Dog() {
//		super();
		// TODO Auto-generated constructor stub
		this(0,0,null);
		System.out.println();
		
	}

	public Dog(float height, int age, String noise) {
		super(height, age, noise);
		// TODO Auto-generated constructor stub
	}
	
	public Dog(float height, int age, String noise, boolean loyal) {
		super(height, age, noise);
		this.loyal=loyal;
		
	}
	
	
	public void display() {
		
		System.out.println("Child class");
		super.display();
	}

	public Dog(boolean loyal) {
		super();
		this.loyal = loyal;
	}

	public boolean isLoyal() {
		return loyal;
	}

	public void setLoyal(boolean loyal) {
		this.loyal = loyal;
	}

	@Override
	public String toString() {
		return "Dog [loyal=" + loyal + "]";
	}

}
