package com.gvacharya.oops.abstraction.main;

import com.gvacharya.oops.abstraction.Addition;
import com.gvacharya.oops.abstraction.ArithematicOperation;
import com.gvacharya.oops.abstraction.Multiplication;
import com.gvacharya.oops.abstraction.Substraction;

public class MainArithematicOperation {

	public static void main(String[] args) {
//		ArithematicOperation addition=new Addition();
//		System.out.println(addition.operation(10,20));
//		
//		ArithematicOperation substraction=new Substraction();
//		System.out.println(substraction.operation(20,10));
//		
//		ArithematicOperation multiplication=new Multiplication();
//		System.out.println(multiplication.operation(10,20));
		
		
		ArithematicOperation addition = new ArithematicOperation() {
			
			@Override
			public int operation(int number1,int number2) {
				return number1+number2;
			}
		};
		
		int result=addition.operation(10, 20);
		System.out.println(result);
		
		// invoke constructor of abstract class { anonymos class body };
ArithematicOperation substraction = new ArithematicOperation() {
			
			@Override
			public int operation(int number1,int number2) {
				return number1-number2;
			}
		};
		
		result=substraction.operation(20, 10);
		System.out.println(result);
		
		// substraction1
		ArithematicOperation substraction1 = new ArithematicOperation() {
			
			@Override
			public int operation(int a, int b) {
				return a-b;
			}
		};
		substraction1.operation(10, 5);
		
ArithematicOperation multiplication = new ArithematicOperation() {
			
			@Override
			public int operation(int number1,int number2) {
				return number1*number2;
			}
		};
		
		result=multiplication.operation(10, 20);
		System.out.println(result);
		
		
ArithematicOperation division = new ArithematicOperation() {
			
			@Override
			public int operation(int number1,int number2) {
				return number1/number2;
			}
		};
		
		result=division.operation(10, 20);
		System.out.println(result);
		
		
ArithematicOperation modulo = new ArithematicOperation() {
			
			@Override
			public int operation(int number1,int number2) {
				return number1%number2;
			}
		};
		
		result=modulo.operation(10, 20);
		System.out.println(result);
		
		
	}
}
