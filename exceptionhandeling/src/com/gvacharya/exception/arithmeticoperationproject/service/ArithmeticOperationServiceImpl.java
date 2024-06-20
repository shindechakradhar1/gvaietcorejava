package com.gvacharya.exception.arithmeticoperationproject.service;

import com.gvacharya.exception.arithmeticoperationproject.dao.ArithmeticOperationDao;
import com.gvacharya.exception.arithmeticoperationproject.dao.ArithmeticOperationDaoImpl;

public class ArithmeticOperationServiceImpl implements ArithmeticOperationService {

	ArithmeticOperationDao dao = new ArithmeticOperationDaoImpl();
	
	@Override
	public int addition(int number1, int number2) {
		// TODO Auto-generated method stub
		return dao.addition(number1, number2);
	}

	@Override
	public int substraction(int number1, int number2) {
		// TODO Auto-generated method stub
		return dao.substraction(number1, number2);
	}

	@Override
	public int multiplication(int number1, int number2) {
		// TODO Auto-generated method stub
		return dao.multiplication(number1, number2);
	}

	@Override
	public int division(int number1, int number2) {
		// TODO Auto-generated method stub
		return dao.division(number1, number2);
	}

}
