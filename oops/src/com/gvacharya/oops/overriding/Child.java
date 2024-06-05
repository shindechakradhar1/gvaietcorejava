package com.gvacharya.oops.overriding;

import java.util.EmptyStackException;

public class Child extends Parent{

	@Override
	public void printProfession() {
		System.out.println("Profession of Child:" + getProfession());
	}
	
	@Override
	protected EmptyStackException getObject() {
		return new EmptyStackException();
	}
}
