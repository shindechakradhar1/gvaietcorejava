package com.gvacharya.oops.upcastingdowncasting;

public class Dog extends Animal{

	private boolean loyal;
	
	public Dog() {}
	
	public Dog(int height, String noise, boolean loyal) {
		super(height, noise);
		System.out.println("Child constructor");
		this.loyal=loyal;	
	}
	
	@Override
	public void printProperties() {
		System.out.println("Override");
	}
	
	public void printProperties1() {
		System.out.println("Loyal: " + loyal );
	}
}
