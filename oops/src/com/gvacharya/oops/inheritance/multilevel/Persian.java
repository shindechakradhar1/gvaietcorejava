package com.gvacharya.oops.inheritance.multilevel;

public class Persian extends Cat {

	private boolean hairy;

	public Persian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persian(float height, int age, String noise) {
		super(height, age, noise);
		// TODO Auto-generated constructor stub
	}

	public Persian(boolean hairy) {
		super();
		this.hairy = hairy;
	}

	public boolean isHairy() {
		return hairy;
	}

	public void setHairy(boolean hairy) {
		this.hairy = hairy;
	}

	@Override
	public String toString() {
		return "Persian [hairy=" + hairy + "]";
	}

}
