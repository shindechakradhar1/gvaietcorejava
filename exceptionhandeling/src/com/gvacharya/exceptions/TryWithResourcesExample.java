package com.gvacharya.exceptions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		int[] intArray = new int[2];
		try(
//				Student student = new Student();
			 IntStream intStream = Arrays.stream(intArray);
			 IntStream intStream1 = Arrays.stream(intArray);
			 IntStream intStream2 = Arrays.stream(intArray);
			){
			
		}
	
		try {
			
		}finally {
			
		}
	}
		
}
