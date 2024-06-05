package com.gvacharya.oops.inheritance.parent;

public class Animal {

	private float height;
	private String color;
	private String noise;

	public Animal() {}

	public Animal(float height, String color, String noise) {
		this.height = height;
		this.color = color;
		this.noise = noise;
	}

	
	@Override
	public String toString() {
		return "Animal [height=" + height + ", color=" + color + ", noise=" + noise + "]";
	}

}
