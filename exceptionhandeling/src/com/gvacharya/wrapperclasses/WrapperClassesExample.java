package com.gvacharya.wrapperclasses;

import java.util.ArrayList;

public class WrapperClassesExample {

	public static void main(String[] args) {
		
////		Integer number = new Integer(10);
//		Integer number = Integer.valueOf(10); // Boxing
//		
//		int tempVal=20;
//		Integer number1=tempVal; // 
//		System.out.println(number);
//		
//		
//		int tempVal1=Integer.valueOf(number); // unboxing
//		
//		tempVal = number; // auto unboxing
		
		Integer number1=10;
		Integer number2=20;
		
		Integer number3= Integer.parseInt("123");
		
		float floatVal=number3.floatValue();
		
		System.out.println(number3+2);
		add(number1, number2);
		
		// Long
		
		Long longVal = 10L;
		
		float floatVal1=longVal.floatValue();
	
		Boolean flag=true;
		String flagString = flag.toString();
		
		System.out.println(Character.MAX_VALUE);
		
		Boolean.parseBoolean("true");
		
		int intVal=number1.valueOf("10");
		
		StringBuilder strValue = 
				new StringBuilder(number1.toString());
		System.out.println(strValue.reverse());
		
		int result=Integer.compare(intVal, intVal);
		
		number1.compareTo(number3);
		
		number1.equals(number3);
		
		Integer compNumber1= new Integer(10);
		
		Integer compNumber2=10;
		
		System.out.println(compNumber1.equals(compNumber2));
		
		// Wrapper classes
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
	}
	
	public static void add(int number1, int number2) {
		System.out.println(number1+number2);
	}
}
