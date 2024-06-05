package com.gvacharya.oops.encapsulation;

public class Addition {

	// properties are private
	private int number1;
	private int number2;
	
	
	// public behaviors
	public Addition(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public Addition() {}
	
	public int getNumber1() {
		return number1;
	}
	
	public void setNumber1(int number1) {
		if(number1>0)
			this.number1 = number1;
	}
	
	public int getNumber2() {
		return number2;
	}
	
	public void setNumber2(int number2) {
		// better control over instance Variable
		if(number2>0)
			this.number2 = number2;
	}
	
	public void addTwoNumber() {
		
		if(number1>0 && number2>0)
			System.out.println(number1+number2);
		else
			System.out.println("either number1 or number2 or both numbers are negative");
	}
	
	

	@Override
	public String toString() {
		return "Addition [number1=" + number1 + ", number2=" + number2 + "]";
	}
	
}
