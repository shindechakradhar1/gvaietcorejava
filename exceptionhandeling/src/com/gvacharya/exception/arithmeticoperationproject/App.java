package com.gvacharya.exception.arithmeticoperationproject;

import java.util.Scanner;

import com.gvacharya.exception.arithmeticoperationproject.utility.ArithmeticUtility;
import com.gvacharya.exception.arithmeticoperationproject.utility.ArithmeticUtilityImpl;

public class App {

	public static void main(String[] args) {
		ArithmeticUtility helper = new ArithmeticUtilityImpl();
		int choice=0;

		
			try(
					Scanner scanner = new Scanner(System.in);
				){
				do {
				choice=helper.printMenu(scanner);
				System.out.println(choice);
			
			
			switch(choice) {
			case 1->helper.addition(scanner);
			case 2->helper.substraction(scanner);
			case 3->helper.multiplication(scanner);
			case 4->helper.division(scanner);
			case 0->System.out.println("Exit");
			default -> System.out.println("Invalid Input");
			}
			
			
		}while(choice!=0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
