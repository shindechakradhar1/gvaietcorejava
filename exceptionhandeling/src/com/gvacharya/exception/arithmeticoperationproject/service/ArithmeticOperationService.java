package com.gvacharya.exception.arithmeticoperationproject.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.gvacharya.exception.arithmeticoperationproject.customexceptions.DivideByZeroException;
import com.gvacharya.exception.arithmeticoperationproject.customexceptions.InvalidPathNameException;

public interface ArithmeticOperationService {

	int addition(int number1, int number2) throws FileNotFoundException, IOException;
	int substraction(int number1, int number2) throws InvalidPathNameException;
	int multiplication(int number1, int number2) throws InvalidPathNameException;
	int division(int number1, int number2) throws InvalidPathNameException, DivideByZeroException;
}
