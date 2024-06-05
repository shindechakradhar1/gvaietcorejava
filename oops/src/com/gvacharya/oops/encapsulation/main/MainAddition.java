package com.gvacharya.oops.encapsulation.main;

import com.gvacharya.oops.encapsulation.Addition;

public class MainAddition {

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.setNumber1(10);
		addition.setNumber2(20);
		addition.addTwoNumber();
	}
}
