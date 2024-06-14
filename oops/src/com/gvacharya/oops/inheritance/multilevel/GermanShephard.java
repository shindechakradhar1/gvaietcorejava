package com.gvacharya.oops.inheritance.multilevel;

public class GermanShephard extends Dog {

	private boolean herding;

	public GermanShephard() {
		super();
	}

	public GermanShephard(float height, int age, String noise) {
		super(height, age, noise);
	}

	public GermanShephard(boolean herding) {
		super();
		this.herding = herding;
	}

	public boolean isHerding() {
		return herding;
	}

	public void setHerding(boolean herding) {
		this.herding = herding;
	}

	@Override
	public String toString() {
		return "GermanShephard [herding=" + herding + "]";
	}

}
