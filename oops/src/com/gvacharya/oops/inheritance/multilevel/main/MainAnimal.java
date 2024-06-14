package com.gvacharya.oops.inheritance.multilevel.main;

import com.gvacharya.oops.inheritance.multilevel.Animal;
import com.gvacharya.oops.inheritance.multilevel.Cat;
import com.gvacharya.oops.inheritance.multilevel.Dog;
import com.gvacharya.oops.inheritance.multilevel.GermanShephard;
import com.gvacharya.oops.inheritance.multilevel.Persian;

public class MainAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		GermanShephard germanShepherd = new GermanShephard();
		
//		animal.setAge(30);
//		animal.setHeight(50.12F);
		animal.setNoise("Barking");
		
//		dog.setAge(6);
//		dog.setHeight(40.34F);
//		dog.setNoise("Barking");
//		dog.setLoyal(false);
		
		
		germanShepherd.setAge(9);
		germanShepherd.setHeight(50.21F);
		germanShepherd.setNoise("Wooof");
		germanShepherd.setLoyal(true);
		germanShepherd.setHerding(false);
		
		
		Cat cat = new Cat();
		Persian persianCat = new Persian();
		
		cat.setAge(3);
		cat.setHeight(20);
		cat.setNoise("Meow");
		cat.setWild(true);
		
		
		
		persianCat.setAge(2);
		persianCat.setHeight(10);
		persianCat.setNoise("Meow");
		persianCat.setWild(false);
		persianCat.setHairy(true);
	}
}
