package com.gvacharya.exception.arithmeticoperationproject.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.gvacharya.exception.arithmeticoperationproject.service.ArithmeticOperationService;
import com.gvacharya.exception.arithmeticoperationproject.service.ArithmeticOperationServiceImpl;

public class ArithmeticUtilityImpl implements ArithmeticUtility {

	ArithmeticOperationService service = new ArithmeticOperationServiceImpl();
	
	@Override
	public int printMenu(Scanner scanner) throws Exception {
//		int i=1;
		int choice=0;
		for(Menu menu:Menu.values())
			System.out.println( menu.getSrNo() 
					+ "." +menu.name() 
					+ "(" + menu.getInfo() + ")") ;
		
		try {
			choice = scanner.nextInt();
		}catch(InputMismatchException ime) {
			throw new Exception("Please Enter Valid Number", ime);
		}
		
		return choice;
	}

	@Override
	public void addition(Scanner scanner) {
		System.out.println("Enter 2 Numbers For Addition");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		System.out.println(service.addition(number1, number2));
	}

	@Override
	public void substraction(Scanner scanner) {
		System.out.println("Enter 2 Numbers For Substraction");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		System.out.println(service.substraction(number1, number2));
	}

	@Override
	public void multiplication(Scanner scanner) {
		System.out.println("Enter 2 Numbers For Multiplication");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		System.out.println(service.multiplication(number1, number2));
	}

	@Override
	public void division(Scanner scanner) {
		System.out.println("Enter 2 Numbers For Division");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		System.out.println(service.division(number1, number2));
	}
}
