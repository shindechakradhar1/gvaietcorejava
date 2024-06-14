package com.gvacharya.interfaces.demo;

@FunctionalInterface
public interface ArithematicOperation {

	int count=0;
	
	//SAM
	int operation(int number1, int number2);
	
//	public void display() {
//		System.out.println("hello");
//	}
	
//	public final void display() {
//		System.out.println("Hello");
//	}
	
//	public Arithematic() {}
	
	
	public static void display() {
		System.out.println("Hello");
	}
	
	private int getAge() {
		return 10;
	}
	
	public default void showMessage() {
		System.out.println(getAge());
	}
}
