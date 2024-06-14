package com.gvacharya.accessmodifiers.demo;

public class Parent {

	private int number;
	
	public Parent() {}
	
	private void parentShow() {
		System.out.println("Parent Show");
		
		int number2;
	}
	
	private void parentShowTest() {
		parentShow();
		number=10;
	}
	
}
