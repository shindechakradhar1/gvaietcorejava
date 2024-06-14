package com.gvacharya.oops.upcastingdowncasting;

public class Animal {

	private int height;
	private String noise;
	
	public Animal() {}
	
	public Animal(int height, String noise) {
		System.out.println("Super constructor");
		this.height=height;
		this.noise=noise;
	}
	
	public void printProperties() {
		System.out.println("height: " + height + " noise: " + noise);
	}
}
