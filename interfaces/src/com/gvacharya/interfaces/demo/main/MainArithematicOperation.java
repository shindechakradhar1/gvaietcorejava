package com.gvacharya.interfaces.demo.main;

import com.gvacharya.interfaces.demo.Addition;
import com.gvacharya.interfaces.demo.ArithematicOperation;

public class MainArithematicOperation {

	public static void main(String[] args) {
		ArithematicOperation addition=new Addition();
		System.out.println(addition.operation(10,20));
		
		
		ArithematicOperation substraction = (number1, number2) ->  number1-number2;
		
		System.out.println(substraction.operation(20, 10));
		
		
		ArithematicOperation multiplication = (no1, no2) -> no1*no2;
		
		System.out.println(multiplication.operation(10,20));
	}
}
