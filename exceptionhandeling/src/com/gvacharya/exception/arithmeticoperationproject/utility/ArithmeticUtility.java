package com.gvacharya.exception.arithmeticoperationproject.utility;

import java.util.Scanner;

public interface ArithmeticUtility {

	int printMenu(Scanner scanner) throws Exception ;
	
	void addition(Scanner scanner);
	void substraction(Scanner scanner);
	void multiplication(Scanner scanner);
	void division(Scanner scanner);
}
