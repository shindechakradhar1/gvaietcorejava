package com.gvacharya.exception.arithmeticoperationproject.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.gvacharya.exception.arithmeticoperationproject.customexceptions.DivideByZeroException;
import com.gvacharya.exception.arithmeticoperationproject.customexceptions.InvalidPathNameException;
import com.gvacharya.exception.arithmeticoperationproject.dao.ArithmeticOperationDao;
import com.gvacharya.exception.arithmeticoperationproject.dao.ArithmeticOperationDaoImpl;

public class ArithmeticOperationServiceImpl implements ArithmeticOperationService {

	ArithmeticOperationDao dao = new ArithmeticOperationDaoImpl();
	
	@Override
	public int addition(int number1, int number2) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return dao.addition(number1+number2);
	}

	@Override
	public int substraction(int number1, int number2) throws InvalidPathNameException {
		// TODO Auto-generated method stub
		return dao.substraction(number1-number2);
	}

	@Override
	public int multiplication(int number1, int number2) throws InvalidPathNameException {
		// TODO Auto-generated method stub
		return dao.multiplication(number1*number2);
	}

	@Override
	public int division(int number1, int number2) throws InvalidPathNameException, DivideByZeroException {
		int result;
		try {
			result = dao.division(number1/number2);
		}catch(ArithmeticException e) {
			result=0;
			throw new DivideByZeroException("Divide method throws Divide By zero Exception", e);
		}
		
		return result;
	}

}
