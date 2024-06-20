package com.gvacharya.exceptions;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			division(10,0);
		} catch (Exception e) {
//			Exception message Stacktrace
//			e.printStackTrace();
//			Exception message
//			System.out.println(e);
//			Message 
//			System.out.println(e.getMessage());
			
//			method name line no
			StackTraceElement[] elements= e.getStackTrace();
			for(StackTraceElement ex:elements)
				System.out.println(ex.getMethodName() + ":" + ex.getLineNumber());
			
		}
	}
	
	public static void division(int number1, int number2)
	throws Exception 
	{
//		System.out.println(number1/number2);
		if(number2==0)
			throw new Exception("hi");
	}
}
