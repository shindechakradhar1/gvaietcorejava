package com.gvacharya.oops.abstraction1;

public abstract class BankAccount {

	private int number1;
	private int number2;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "BankAccount [number1=" + number1 + ", number2=" + number2 + "]";
	}

	public abstract void print();
	public abstract void print1();
	public abstract void print2();
	public abstract void print3();
	public abstract void print5();
	public abstract void print4();
	public abstract void print6();
	public abstract void print7();
	public abstract void print8();
	public abstract void print9();
	public abstract void print10();
}
