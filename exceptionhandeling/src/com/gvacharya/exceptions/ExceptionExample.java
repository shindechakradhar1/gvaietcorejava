package com.gvacharya.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.IntStream;

public class ExceptionExample {

	public static void main(String[] args) {
//		try {
//			int number=10/0;
//			
//			System.out.println("After line no:7");
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		int number=10/0;

//		System.out.println("Hello");
//		division(10,0);
//		try {
//		division(10,0);
//		}catch(ArithmeticException ex) {
//			System.out.println(ex);
//		}
//		
//		try {
//			System.out.println(getDate("18.06.2024"));
//		} catch (ParseException e) {
//			System.out.println(e);
//		}
		
//		division(10,0);
//		getDate();
		
		int[]  intArray = {1,2};
		IntStream intStream=null;
		try {
			intStream = Arrays.stream(intArray);
			intStream.sorted().forEach(System.out::println);
			
		}
		catch(IndexOutOfBoundsException iobe) {
			System.out.println(iobe);
		}
		catch(RuntimeException re) {
			System.out.println(re);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		catch(Throwable tex) {
			System.out.println(tex);
		}
		
		
	}

	public static void division(int number1, int number2) {
		System.out.println(number1 / number2);
	}
	
	public static Date getDate(String dateString) 
			throws ParseException {
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("dd.MM.yy");
		return dateFormat.parse(dateString);
	}
}
