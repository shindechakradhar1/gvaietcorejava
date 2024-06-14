package com.gvacharya.functionalinterfaces.test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainFunctionalInterface {

	
	public static void main(String[] args) {
		Consumer<Double> doubleConsumer = number->System.out.println(number);
		
		doubleConsumer.accept(10D);
		
		Consumer<Float> floatConsumer = number->System.out.println(number);
		
		floatConsumer.accept(12.12F);
		
		
		Supplier<Double> doubleSupplier = ()->Math.random();
		
//		double randomNumber1 = doubleSupplier.get();
//		System.out.println(randomNumber1);
//		double randomNumber2 = doubleSupplier.get();
//		System.out.println(randomNumber2);
//		double randomNumber3 = doubleSupplier.get();
//		System.out.println(randomNumber3);
//		double randomNumber4 = doubleSupplier.get();
//		System.out.println(randomNumber4);
		
		
		doubleConsumer.accept(doubleSupplier.get());
		doubleConsumer.accept(doubleSupplier.get());
		doubleConsumer.accept(doubleSupplier.get());
		doubleConsumer.accept(doubleSupplier.get());
		doubleConsumer.accept(doubleSupplier.get());
		
		Predicate<Double> doublePredicate = number->number>0;
		
		if(doublePredicate.test(doubleSupplier.get()))
			System.out.println("Number is Positive");
		else
			System.out.println("Number is Negative");
		
		
		Function<Integer, String> intFunction = number -> "number :" + number;
		
//		String result = ;
		System.out.println(intFunction.apply(10));
	}
}
