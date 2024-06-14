package com.gvacharya.oops.inheritance.multilevel;

public class Cat extends Animal {

	private boolean wild;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(float height, int age, String noise) {
		super(height, age, noise);
		// TODO Auto-generated constructor stub
	}

	public Cat(boolean wild) {
		super();
		this.wild = wild;
	}

	public boolean isWild() {
		return wild;
	}

	public void setWild(boolean wild) {
		this.wild = wild;
	}

	@Override
	public String toString() {
		return "Cat [wild=" + wild + "]";
	}

}
