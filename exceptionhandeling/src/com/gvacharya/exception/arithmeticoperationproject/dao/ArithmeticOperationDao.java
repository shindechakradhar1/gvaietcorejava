package com.gvacharya.exception.arithmeticoperationproject.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.gvacharya.exception.arithmeticoperationproject.customexceptions.InvalidPathNameException;

public interface ArithmeticOperationDao {

	int addition(int result) throws FileNotFoundException, IOException;
	int substraction(int result) throws InvalidPathNameException;
	int multiplication(int result) throws InvalidPathNameException;
	int division(int result) throws InvalidPathNameException;
	
}
