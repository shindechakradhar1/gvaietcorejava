package com.gvacharya.oops.upcastingdowncasting.main;

import com.gvacharya.oops.upcastingdowncasting.Animal;
import com.gvacharya.oops.upcastingdowncasting.Dog;

public class MainAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal(10,"chirping");
		Dog dog = new Dog(30,"Bark", true);
		
		String name;
		
		animal.printProperties();
		dog.printProperties();
		dog.printProperties1();
		
//		 Upcasting sub-to-super
		animal=dog;
		
		 animal.printProperties();
//		 animal.printProperties1();
		 
		//downcasting super-to-subtype
//		dog=(Dog)animal;
		 
		 
	}
}
