package com.gvacharya.oops.inheritance.child;

import com.gvacharya.oops.inheritance.parent.Animal;

public class Dog extends Animal{

	private int legs;

	public Dog() {
		this(100,"Black", "Bark", 4);
	}

	public Dog(float height, String color, String noise, int legs) {
		// invoking parent class constructor using super
		super(height, color, noise);
		this.legs=legs;
	}

	public Dog(int legs) {
		this.legs = legs;
	}


	@Override
	public String toString() {
		return "Dog [legs=" + legs + ", Animal=" + super.toString() + "]";
	}
	
}
