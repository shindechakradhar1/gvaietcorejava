package com.gvacharya.oops.overloading;

public class Geometry {

//	public void area(int height, int width) {
//		System.out.println("Area of Rect(int, int):" + (height*width));
//	}
	
	public static void area(int radius) throws RuntimeException {
		System.out.println("Area of Circle(int): " + (3.14*radius*radius));
	}
	
	public static int area(float radius) {
		return (int)(3.14*radius*radius);
	}
	
	// Ambiguity
	public void area(float height, int width) {
		System.out.println("(float,int)" + height*width);
	}
	
	public void area(int height, float width) {
		System.out.println("(int, float)"+height*width);
	}
	
	
	
}
