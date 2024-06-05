package com.gvacharya.oops.overloading.main;

import com.gvacharya.oops.overloading.Geometry;

public class MainGeometry {

	public static void main(String[] args) {
		Geometry rectangle = new Geometry();
		rectangle.area(10F,20);
		
		Geometry circle = new Geometry();
		circle.area(12.2F);

		Geometry circle1 = new Geometry();
		circle1.area(12);
		
		
	}
}
