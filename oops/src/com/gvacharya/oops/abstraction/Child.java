package com.gvacharya.oops.abstraction;

public abstract class Child extends Parent{

	@Override
	public GrandChild method1() {
		System.out.println("method1");
		return new GrandChild();
	}
	@Override
	public void method2() {
		System.out.println("method2");
	}
	@Override
	public void method3() {
		System.out.println("method3");
	}
	@Override
	public void method4() {
		System.out.println("method4");
	}
	@Override
	public void method5() {
		System.out.println("method5");
	}
}
