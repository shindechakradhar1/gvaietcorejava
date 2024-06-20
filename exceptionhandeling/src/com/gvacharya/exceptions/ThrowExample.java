package com.gvacharya.exceptions;

public class ThrowExample {

	public static void main(String[] args) {
		try {
			division(10,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		division(10,20);
	}
	
	public static void division(int number1, int number2) throws Exception {
		if(number2==0)
			throw new Exception("Can not Divide by Zero");
	}
}
