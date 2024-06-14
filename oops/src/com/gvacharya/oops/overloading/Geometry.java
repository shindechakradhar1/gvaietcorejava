package com.gvacharya.oops.overloading;

public class Geometry {

	public void area(float radius) {
		System.out.println("(float) Area: " + (3.14*radius*radius));	
	}
	
	int area(int height, int width) throws RuntimeException{
		System.out.println("Area: " + (height*width));
		return 0;
	}
	
	public void area(int radius) throws RuntimeException {
		System.out.println("(int) Area: " + (3.14*radius*radius));
	}
	
	//ambiguity issue
	public void area(float height, int width) {
		System.out.println(height*width);
	}
	
	public void area(int height, float width) {
		System.out.println(height*width);
	}
}
