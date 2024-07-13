package com.gvacharya.association;

import com.gvacharya.association.classes.Car;
import com.gvacharya.association.classes.Engine;

public class AssociationExamples {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNoOfTyres(4);
		car1.setBrand("Toyota");
		System.out.println(car1);
		
		Engine engine = new Engine();
		engine.setPertrol(true);
		engine.setPowerSteering(true);
		engine.setStokes(4);
		
		car1.setEngine(engine);
		
//		Engine engine1 = car1.getEngine();
	}
}
